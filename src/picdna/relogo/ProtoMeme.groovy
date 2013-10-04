package picdna.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Plural;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import picdna.ReLogoTurtle;

/**
 * PicDNA Turtle (Intelligent Agent)
 * Creator: Gael Abadin
 * Version: 0.6
 *-----------------------------------------------------------------------------
 *  Copyright (C) 2012-2013 Gael Abadin
 *-----------------------------------------------------------------------------
 */
class ProtoMeme extends ReLogoTurtle{
	def locked = false
	def isLeft = false
	int mysteps = 0
	int mylifespan = repast.simphony.random.RandomHelper.createExponential(1/averageLifeSpan).nextInt()
	def horizon = minHorizon
	def calculateMovementHeuristicOn(cell,turtlesInHorizon){
		int sumOfInvDistance = 0
		if (turtlesInHorizon!=null){
			for (t in turtlesInHorizon){
				if (((!t.locked)||(useLocked == "Yes"))&&((!t.isHiddenQ())||overlapping)){
					def distance = (useDistance == "Yes") ? cell.distance(t) : 1
					def tSize = (useSize == "Yes") ? t.getSize() : 1
					if (t.isHiddenQ()){
						def edgeDistance = t.isLeft ? t.getPxcor()-leftActiveEdgeXcor:rightActiveEdgeXcor-t.getPxcor()
						sumOfInvDistance -= (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
					} else if (t.locked) {
						sumOfInvDistance -= tSize/distance
					} else {
						sumOfInvDistance += tSize/distance
					}
				}
			}
		}
		return sumOfInvDistance
	}
	def calculateColorHeuristicOn(cell,turtlesInHorizon,mycolor){
		int sumOfInvDistance = 0
		if (turtlesInHorizon != null){
			for (t in turtlesInHorizon){
				if (((!t.locked)||(useLocked == "Yes"))&&((!t.isHiddenQ())||overlapping)){
					def distance = (useDistance == "Yes") ? cell.distance(t) : 1
					def tSize = (useSize == "Yes") ? t.getSize() : 1
					if (t.isHiddenQ()){
						def edgeDistance = t.isLeft ? t.getPxcor()-leftActiveEdgeXcor:rightActiveEdgeXcor-t.getPxcor()
						if (t.getColor()==mycolor) {
							sumOfInvDistance -= (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						} else {
							sumOfInvDistance += (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						}
					} else if ((t.locked)&&(t.getColor()!=mycolor)||(!(t.locked))&&(t.getColor()==mycolor)) {
						sumOfInvDistance += tSize/distance
					} else {
						sumOfInvDistance -= tSize/distance
					}
				}
			}
		}
		return sumOfInvDistance
	}
	def calculateShapeHeuristicOn(cell,turtlesInHorizon,myShape){
		int sumOfInvDistance = 0
		if (turtlesInHorizon!=null){
			for (t in turtlesInHorizon){
				if (((!t.locked)||(useLocked == "Yes"))&&((!t.isHiddenQ())||overlapping)){
					def distance = (useDistance == "Yes") ? cell.distance(t) : 1
					def tSize = (useSize == "Yes") ? t.getSize() : 1
					if (t.isHiddenQ()){
						def edgeDistance = t.isLeft ? t.getPxcor()-leftActiveEdgeXcor:rightActiveEdgeXcor-t.getPxcor()
						if (t.getShape()==myShape) {
							sumOfInvDistance -= (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						} else {
							sumOfInvDistance += (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						}
					} else if ((t.locked)&&(t.getShape()!=myShape)||(!(t.locked))&&(t.getShape()==myShape)) {
						sumOfInvDistance += tSize/distance
					} else {
						sumOfInvDistance -= tSize/distance
					}
				}
			}
		}
		return sumOfInvDistance
	}
	def calculateSizeHeuristicOn(cell,turtlesInHorizon,mySize){
		int sumOfInvDistance = 0
		if (turtlesInHorizon!=null){
			for (t in turtlesInHorizon){
				if (((!t.locked)||(useLocked == "Yes"))&&((!t.isHiddenQ())||overlapping)){
					def distance = (useDistance == "Yes") ? cell.distance(t) : 1
					def tSize = (useSize == "Yes") ? t.getSize() : 1
					if (t.isHiddenQ()){
						def edgeDistance = t.isLeft ? t.getPxcor()-leftActiveEdgeXcor:rightActiveEdgeXcor-t.getPxcor()
						if (t.getSize()<mySize) {
							sumOfInvDistance -= (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						} else if (t.getSize()>mySize){
							sumOfInvDistance += (tSize/distance)*(1 - evanescence*edgeDistance/(rightActiveEdgeXcor-leftActiveEdgeXcor))*overlapping
						}
					} else if ((t.locked)&&(t.getSize()<mySize)||(!(t.locked))&&(t.getSize()>mySize)) {
						sumOfInvDistance -= tSize/distance
					} else if ((t.locked)&&(t.getSize()>mySize)||(!(t.locked))&&(t.getSize()<mySize)) {
						sumOfInvDistance += tSize/distance
					}
				}
			}
		}
		return sumOfInvDistance
	}
	def step(){
		//This is what each intelligent agent does in each simulation step.
		if ((!locked)&&(!isHiddenQ())){
			mysteps++
			if (lockHorizon=="No"){
				if (inRadius(protoMemes(),horizon)==null){
					horizon++
				} else if (horizon>minHorizon) if (inRadius(protoMemes(),horizon-1)!=null){
					horizon--
				}
			}
			if (movementHeuristic=="Yes"){
				def posbias = minOneOf(neighbors()){
					calculateMovementHeuristicOn (it,inRadius(protoMemes(),horizon))
				}

				def poswinner = (randomFloat(1)<dirRandomness)?posbias:oneOf(neighbors())

				face(poswinner)
				forward(movementStep)
			}
			if (colorHeuristic=="Yes"){
				def colorbiasN = calculateColorHeuristicOn (patchHere(),inRadius(protoMemes(),horizon),getColor())
				def colorbias = (colorbiasN > 0) ? ((getColor()==blue())?red():blue()):(getColor())
				def colorwinner = (randomFloat(1)<colorRandomness)?colorbias:((randomFloat(1)<0.5)?red():blue())
				setColor(colorwinner)
			}
			if (shapeHeuristic=="Yes"){
				def shapebiasN = calculateShapeHeuristicOn (patchHere(),inRadius(protoMemes(),horizon),getShape())
				def shapebias = (shapebiasN > 0) ? ((getShape()=="square")?"circle":"square"):(getShape())
				def shapewinner = (randomFloat(1)<shapeRandomness)?shapebias:((randomFloat(1)<0.5)?"circle":"square")
				setShape(shapewinner)
			}
			if (sizeHeuristic=="Yes"){
				def sizebiasN = calculateSizeHeuristicOn (patchHere(),inRadius(protoMemes(),horizon),getSize())
				def sizebias = (sizebiasN < 0) ? (getSize()-1):((sizebiasN>0)?(getSize()+1):getSize())
				def sizewinner = (randomFloat(1)<sizeRandomness)?sizebias:((randomFloat(1)<0.5)?getSize()+1:getSize()-1)
				if ((sizewinner>=minSize)&&(sizewinner<=maxSize)) setSize(sizewinner)
			}
			label = ""
			if ((protoMemesCount>populationLimit)&&(randomFloat(1)<1-populationLimit/protoMemesCount)||mysteps>mylifespan) {
				die()
				protoMemesCount--
			}
		}
	}

}
