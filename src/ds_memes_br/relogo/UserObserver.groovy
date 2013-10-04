package ds_memes_br.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*
import repast.simphony.relogo.BaseObserver
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.engine.environment.RunEnvironment
import repast.simphony.parameter.Parameters
/**
* PicDNA Simulation Observer
* Creator: Gael Abadin
* Version: 0.5
*-----------------------------------------------------------------------------
*  Copyright (C) 2012-2013 Gael Abadin
*-----------------------------------------------------------------------------
*/
class UserObserver extends BaseObserver{

	/**
	 * Add observer methods here. For example:

		def setup(){
			clearAll()
			createTurtles(10){
				forward(random(10))
			}
		}
		
	 *
	 * or
	 * 	
	
		def go(){
			ask(turtles()){
				left(random(90))
				right(random(90))
				forward(random(10))
			}
		}

	 */
	
	// The UserObserver setup method
		def setup(){
			clearAll()
			protoMemesCount=0
			numCircleMemesL=0
			numCircleMemesR=0
			numRedColorMemesL=0
			numRedColorMemesR=0
			int j
			int nselL = maxSizeL-minSizeL+1
			int sumL = 0
			for (j=1;j<=nselL;j++){
				sumL+=j
			}
			int nselR = maxSizeR-minSizeR+1
			int sumR = 0
			for (j=1;j<=nselR;j++){
				sumR+=j
			}
			int nsel = maxSize-minSize+1
			int sum = 0
			for (j=1;j<=nsel;j++){
				sum+=j
			}
			
			Parameters p = RunEnvironment.getInstance().getParameters()
			worldWidth=p.getValue("default_observer_maxPxcor")-p.getValue("default_observer_minPxcor")
			worldHeight=p.getValue("default_observer_maxPycor")-p.getValue("default_observer_minPycor")
			leftActiveEdgeXcor = worldWidth/3
			rightActiveEdgeXcor = 2 * worldWidth/3 - 1
			createProtoMemes(numLeftMemes){
				def randX=randomXcor()%(worldWidth/6)
				def randY=randomYcor()
				def mysize
				def myshape
				def mycolor = red()
				if (sizeDistrL=="even"){
					mysize=(repast.simphony.random.RandomHelper.getUniform().nextIntFromTo(minSizeL, maxSizeL))
				} else {
					def bar = randomFloat(1)
					int ind = nselL
					def indsum=ind/sumL
					while (indsum<bar){
						ind--
						indsum+=(ind/sumL)
					}
					if (sizeDistrL=="mostly small"){
						mysize=(minSizeL+(nselL-ind))
					} else {
						mysize=(maxSizeL-(nselL-ind))
					}
				}
				setxy((randX-worldWidth/3),randY)
				setSize(mysize)
				if (numRedColorMemesL<redColorL*numLeftMemes){
					mycolor = red()
					numRedColorMemesL++
				} else {mycolor=blue()}
				setColor(mycolor)
				if (numCircleMemesL<circleL*numLeftMemes){
					myshape="circle"
					numCircleMemesL++
				} else {myshape="square"}
				setShape(myshape)
				locked = true
				isLeft = true
				myObserver.createProtoMemes(1){
					setxy(randX,randY)
					setSize(mysize)
					setColor(mycolor)
					setShape(myshape)
					locked = false
					setHiddenQ(true)
					isLeft = true
				}
			}
			createProtoMemes(numRightMemes){
				def randX=randomXcor()%(worldWidth/6)
				def randY=randomYcor()
				def mysize
				def myshape
				def mycolor = red()
				if (sizeDistrR=="even"){
					mysize=(repast.simphony.random.RandomHelper.getUniform().nextIntFromTo(minSizeR, maxSizeR))
				} else {
					def bar = randomFloat(1)
					int ind = nselR
					def indsum=ind/sumR
					while (indsum<bar){
						ind--
						indsum+=(ind/sumR)
					}
					if (sizeDistrR=="mostly small"){
						mysize=(minSizeR+(nselR-ind))
					} else {
						mysize=(maxSizeR-(nselR-ind))
					}
				}
				setxy((randX+worldWidth/3),randY)
				setSize(mysize)
				if (numRedColorMemesR<redColorR*numRightMemes){
					mycolor = red()
					numRedColorMemesR++
				} else {mycolor=blue()}
				setColor(mycolor)
				if (numCircleMemesR<circleR*numRightMemes){
					myshape="circle"
					numCircleMemesR++
				} else {myshape="square"}
				setShape(myshape)
				locked = true
				isLeft = false
				myObserver.createProtoMemes(1){
					setxy(randX,randY)
					setSize(mysize)
					setColor(mycolor)
					setShape(myshape)
					locked = false
					setHiddenQ(true)
					isLeft = false
				}
			}
		}
	
		// The UserObserver go method
	
		def go(){
			for (int i=0; i<numOfProtoMemeCreationAttemptsPerStep; i++){
				if ((protoMemesCount<populationLimit)&&(randomFloat(1)>protoMemesCount/populationLimit)) {
					protoMemesCount++
					createProtoMemes(1){
						def randX=randomXcor()%(worldWidth/6)
						def randY=randomYcor()
						setxy(randX,randY)
						if (sizeDistr=="even"){
							setSize(repast.simphony.random.RandomHelper.getUniform().nextIntFromTo(minSize, maxSize))
						} else {
							def bar = randomFloat(1)
							int ind = nsel
							def indsum=ind/sum
							while (indsum<bar){
								ind--
								indsum+=(ind/sum)
							} 
							if (sizeDistr=="mostly small"){
								setSize(minSize+(nsel-ind))
							} else {
								setSize(maxSize-(nsel-ind))
							}
						}
						(randomFloat(1)<0.5)?setColor(red()):setColor(blue())
						(randomFloat(1)<0.5)?setShape("circle"):setShape("square")
						locked = false
						isLeft = false
						label = "Hello!"
					}
				}
			}
			ask (protoMemes()){
				step()
			}
		}
		
		// The remaining Memes methods
		
		def remainingprotoMemes(){
			protoMemesCount=protoMemes().findAll(){
					((it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingredMemes(){
			protoMemes().findAll(){
					((it.getColor() == red())&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingblueMemes(){
			protoMemes().findAll(){
					((it.getColor() == blue())&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingsquareMemes(){
			protoMemes().findAll(){
					((it.getShape() == "square")&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingcircleMemes(){
			protoMemes().findAll(){
					((it.getShape() == "circle")&&(it.isHiddenQ() == false)&&(it.locked == false))

			}.size()
		}
		def remainingredsquareMemes(){
			protoMemes().findAll(){
					((it.getColor() == red())&&(it.getShape() == "square")&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingredcircleMemes(){
			protoMemes().findAll(){
					((it.getColor() == red())&&(it.getShape() == "circle")&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingbluesquareMemes(){
			protoMemes().findAll(){
					((it.getColor() == blue())&&(it.getShape() == "square")&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
		def remainingbluecircleMemes(){
			protoMemes().findAll(){
					((it.getColor() == blue())&&(it.getShape() == "circle")&&(it.isHiddenQ() == false)&&(it.locked == false))
			}.size()
		}
}