package picdna;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented protoMemes and then executes a set of commands on the
	 * created protoMemes.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created protoMemes
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> createProtoMemes(int number, Closure closure) {
		AgentSet<picdna.relogo.ProtoMeme> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"ProtoMeme");
		for (Turtle t : createResult){
			if (t instanceof picdna.relogo.ProtoMeme){
				result.add((picdna.relogo.ProtoMeme)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented protoMemes and then executes a set of commands on the
	 * created protoMemes.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created protoMemes
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> createProtoMemes(int number) {
		return createProtoMemes(number,null);
	}

	/**
	 * Makes a number of uniformly fanned protoMemes and then executes a set of commands on the
	 * created protoMemes.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created protoMemes
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> createOrderedProtoMemes(int number, Closure closure) {
		AgentSet<picdna.relogo.ProtoMeme> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"ProtoMeme");
		for (Turtle t : createResult){
			if (t instanceof picdna.relogo.ProtoMeme){
				result.add((picdna.relogo.ProtoMeme)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned protoMemes and then executes a set of commands on the
	 * created protoMemes.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created protoMemes
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> createOrderedProtoMemes(int number) {
		return createOrderedProtoMemes(number,null);
	}

	/**
	 * Queries if object is a protoMeme.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a protoMeme
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public boolean isProtoMemeQ(Object o){
		return (o instanceof picdna.relogo.ProtoMeme);
	}

	/**
	 * Returns an agentset containing all protoMemes.
	 * 
	 * @return agentset of all protoMemes
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> protoMemes(){
		AgentSet<picdna.relogo.ProtoMeme> a = new AgentSet<picdna.relogo.ProtoMeme>();
		for (Object e : this.getContext().getObjects(picdna.relogo.ProtoMeme.class)) {
			if (e instanceof picdna.relogo.ProtoMeme){
				a.add((picdna.relogo.ProtoMeme)e);
			}
		}
		return a;
	}

	/**
	 * Returns the protoMeme with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public picdna.relogo.ProtoMeme protoMeme(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof picdna.relogo.ProtoMeme)
			return (picdna.relogo.ProtoMeme) turtle;
		return null;
	}

	/**
	 * Returns an agentset of protoMemes on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of protoMemes on patch p
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> protoMemesOn(Patch p){
		AgentSet<picdna.relogo.ProtoMeme> result = new AgentSet<picdna.relogo.ProtoMeme>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"protoMeme")){
			if (t instanceof picdna.relogo.ProtoMeme)
			result.add((picdna.relogo.ProtoMeme)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of protoMemes on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of protoMemes on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> protoMemesOn(Turtle t){
		AgentSet<picdna.relogo.ProtoMeme> result = new AgentSet<picdna.relogo.ProtoMeme>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"protoMeme")){
			if (tt instanceof picdna.relogo.ProtoMeme)
			result.add((picdna.relogo.ProtoMeme)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of protoMemes on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of protoMemes on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.ProtoMeme")
	public AgentSet<picdna.relogo.ProtoMeme> protoMemesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<picdna.relogo.ProtoMeme>();
		}

		Set<picdna.relogo.ProtoMeme> total = new HashSet<picdna.relogo.ProtoMeme>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(protoMemesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(protoMemesOn(p));
				}
			}
		}
		return new AgentSet<picdna.relogo.ProtoMeme>(total);
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof picdna.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.UserLink")
	public AgentSet<picdna.relogo.UserLink> userLinks(){
		AgentSet<picdna.relogo.UserLink> a = new AgentSet<picdna.relogo.UserLink>();
		for (Object e : this.getContext().getObjects(picdna.relogo.UserLink.class)) {
			if (e instanceof picdna.relogo.UserLink){
				a.add((picdna.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.UserLink")
	public picdna.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (picdna.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("picdna.relogo.UserLink")
	public picdna.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable minHorizon.
	 *
	 * @return the value of the global variable minHorizon
	 */
	@ReLogoBuilderGeneratedFor("global: minHorizon")
	public Object getMinHorizon(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("minHorizon");
	}

	/**
	 * Sets the value of the global variable minHorizon.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: minHorizon")
	public void setMinHorizon(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("minHorizon",value);
	}

	/**
	 * Returns the value of the global variable lockHorizon.
	 *
	 * @return the value of the global variable lockHorizon
	 */
	@ReLogoBuilderGeneratedFor("global: lockHorizon")
	public Object getLockHorizon(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("lockHorizon");
	}

	/**
	 * Sets the value of the global variable lockHorizon.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: lockHorizon")
	public void setLockHorizon(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("lockHorizon",value);
	}

	/**
	 * Returns the value of the global variable movementHeuristic.
	 *
	 * @return the value of the global variable movementHeuristic
	 */
	@ReLogoBuilderGeneratedFor("global: movementHeuristic")
	public Object getMovementHeuristic(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("movementHeuristic");
	}

	/**
	 * Sets the value of the global variable movementHeuristic.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: movementHeuristic")
	public void setMovementHeuristic(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("movementHeuristic",value);
	}

	/**
	 * Returns the value of the global variable movementStep.
	 *
	 * @return the value of the global variable movementStep
	 */
	@ReLogoBuilderGeneratedFor("global: movementStep")
	public Object getMovementStep(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("movementStep");
	}

	/**
	 * Sets the value of the global variable movementStep.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: movementStep")
	public void setMovementStep(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("movementStep",value);
	}

	/**
	 * Returns the value of the global variable dirRandomness.
	 *
	 * @return the value of the global variable dirRandomness
	 */
	@ReLogoBuilderGeneratedFor("global: dirRandomness")
	public Object getDirRandomness(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("dirRandomness");
	}

	/**
	 * Sets the value of the global variable dirRandomness.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: dirRandomness")
	public void setDirRandomness(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("dirRandomness",value);
	}

	/**
	 * Returns the value of the global variable shapeHeuristic.
	 *
	 * @return the value of the global variable shapeHeuristic
	 */
	@ReLogoBuilderGeneratedFor("global: shapeHeuristic")
	public Object getShapeHeuristic(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("shapeHeuristic");
	}

	/**
	 * Sets the value of the global variable shapeHeuristic.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: shapeHeuristic")
	public void setShapeHeuristic(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("shapeHeuristic",value);
	}

	/**
	 * Returns the value of the global variable shapeRandomness.
	 *
	 * @return the value of the global variable shapeRandomness
	 */
	@ReLogoBuilderGeneratedFor("global: shapeRandomness")
	public Object getShapeRandomness(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("shapeRandomness");
	}

	/**
	 * Sets the value of the global variable shapeRandomness.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: shapeRandomness")
	public void setShapeRandomness(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("shapeRandomness",value);
	}

	/**
	 * Returns the value of the global variable colorHeuristic.
	 *
	 * @return the value of the global variable colorHeuristic
	 */
	@ReLogoBuilderGeneratedFor("global: colorHeuristic")
	public Object getColorHeuristic(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("colorHeuristic");
	}

	/**
	 * Sets the value of the global variable colorHeuristic.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: colorHeuristic")
	public void setColorHeuristic(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("colorHeuristic",value);
	}

	/**
	 * Returns the value of the global variable colorRandomness.
	 *
	 * @return the value of the global variable colorRandomness
	 */
	@ReLogoBuilderGeneratedFor("global: colorRandomness")
	public Object getColorRandomness(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("colorRandomness");
	}

	/**
	 * Sets the value of the global variable colorRandomness.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: colorRandomness")
	public void setColorRandomness(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("colorRandomness",value);
	}

	/**
	 * Returns the value of the global variable sizeHeuristic.
	 *
	 * @return the value of the global variable sizeHeuristic
	 */
	@ReLogoBuilderGeneratedFor("global: sizeHeuristic")
	public Object getSizeHeuristic(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeHeuristic");
	}

	/**
	 * Sets the value of the global variable sizeHeuristic.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeHeuristic")
	public void setSizeHeuristic(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeHeuristic",value);
	}

	/**
	 * Returns the value of the global variable sizeStep.
	 *
	 * @return the value of the global variable sizeStep
	 */
	@ReLogoBuilderGeneratedFor("global: sizeStep")
	public Object getSizeStep(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeStep");
	}

	/**
	 * Sets the value of the global variable sizeStep.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeStep")
	public void setSizeStep(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeStep",value);
	}

	/**
	 * Returns the value of the global variable minSize.
	 *
	 * @return the value of the global variable minSize
	 */
	@ReLogoBuilderGeneratedFor("global: minSize")
	public Object getMinSize(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("minSize");
	}

	/**
	 * Sets the value of the global variable minSize.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: minSize")
	public void setMinSize(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("minSize",value);
	}

	/**
	 * Returns the value of the global variable maxSize.
	 *
	 * @return the value of the global variable maxSize
	 */
	@ReLogoBuilderGeneratedFor("global: maxSize")
	public Object getMaxSize(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("maxSize");
	}

	/**
	 * Sets the value of the global variable maxSize.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: maxSize")
	public void setMaxSize(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("maxSize",value);
	}

	/**
	 * Returns the value of the global variable sizeDistr.
	 *
	 * @return the value of the global variable sizeDistr
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistr")
	public Object getSizeDistr(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeDistr");
	}

	/**
	 * Sets the value of the global variable sizeDistr.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistr")
	public void setSizeDistr(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeDistr",value);
	}

	/**
	 * Returns the value of the global variable sizeRandomness.
	 *
	 * @return the value of the global variable sizeRandomness
	 */
	@ReLogoBuilderGeneratedFor("global: sizeRandomness")
	public Object getSizeRandomness(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeRandomness");
	}

	/**
	 * Sets the value of the global variable sizeRandomness.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeRandomness")
	public void setSizeRandomness(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeRandomness",value);
	}

	/**
	 * Returns the value of the global variable useDistance.
	 *
	 * @return the value of the global variable useDistance
	 */
	@ReLogoBuilderGeneratedFor("global: useDistance")
	public Object getUseDistance(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("useDistance");
	}

	/**
	 * Sets the value of the global variable useDistance.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: useDistance")
	public void setUseDistance(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("useDistance",value);
	}

	/**
	 * Returns the value of the global variable useSize.
	 *
	 * @return the value of the global variable useSize
	 */
	@ReLogoBuilderGeneratedFor("global: useSize")
	public Object getUseSize(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("useSize");
	}

	/**
	 * Sets the value of the global variable useSize.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: useSize")
	public void setUseSize(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("useSize",value);
	}

	/**
	 * Returns the value of the global variable useLocked.
	 *
	 * @return the value of the global variable useLocked
	 */
	@ReLogoBuilderGeneratedFor("global: useLocked")
	public Object getUseLocked(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("useLocked");
	}

	/**
	 * Sets the value of the global variable useLocked.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: useLocked")
	public void setUseLocked(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("useLocked",value);
	}

	/**
	 * Returns the value of the global variable numLeftMemes.
	 *
	 * @return the value of the global variable numLeftMemes
	 */
	@ReLogoBuilderGeneratedFor("global: numLeftMemes")
	public Object getNumLeftMemes(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numLeftMemes");
	}

	/**
	 * Sets the value of the global variable numLeftMemes.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numLeftMemes")
	public void setNumLeftMemes(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numLeftMemes",value);
	}

	/**
	 * Returns the value of the global variable numRightMemes.
	 *
	 * @return the value of the global variable numRightMemes
	 */
	@ReLogoBuilderGeneratedFor("global: numRightMemes")
	public Object getNumRightMemes(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRightMemes");
	}

	/**
	 * Sets the value of the global variable numRightMemes.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRightMemes")
	public void setNumRightMemes(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRightMemes",value);
	}

	/**
	 * Returns the value of the global variable circleL.
	 *
	 * @return the value of the global variable circleL
	 */
	@ReLogoBuilderGeneratedFor("global: circleL")
	public Object getCircleL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("circleL");
	}

	/**
	 * Sets the value of the global variable circleL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: circleL")
	public void setCircleL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("circleL",value);
	}

	/**
	 * Returns the value of the global variable numCircleMemesL.
	 *
	 * @return the value of the global variable numCircleMemesL
	 */
	@ReLogoBuilderGeneratedFor("global: numCircleMemesL")
	public Object getNumCircleMemesL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numCircleMemesL");
	}

	/**
	 * Sets the value of the global variable numCircleMemesL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numCircleMemesL")
	public void setNumCircleMemesL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numCircleMemesL",value);
	}

	/**
	 * Returns the value of the global variable circleR.
	 *
	 * @return the value of the global variable circleR
	 */
	@ReLogoBuilderGeneratedFor("global: circleR")
	public Object getCircleR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("circleR");
	}

	/**
	 * Sets the value of the global variable circleR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: circleR")
	public void setCircleR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("circleR",value);
	}

	/**
	 * Returns the value of the global variable numCircleMemesR.
	 *
	 * @return the value of the global variable numCircleMemesR
	 */
	@ReLogoBuilderGeneratedFor("global: numCircleMemesR")
	public Object getNumCircleMemesR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numCircleMemesR");
	}

	/**
	 * Sets the value of the global variable numCircleMemesR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numCircleMemesR")
	public void setNumCircleMemesR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numCircleMemesR",value);
	}

	/**
	 * Returns the value of the global variable redColorL.
	 *
	 * @return the value of the global variable redColorL
	 */
	@ReLogoBuilderGeneratedFor("global: redColorL")
	public Object getRedColorL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("redColorL");
	}

	/**
	 * Sets the value of the global variable redColorL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: redColorL")
	public void setRedColorL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("redColorL",value);
	}

	/**
	 * Returns the value of the global variable numRedColorMemesL.
	 *
	 * @return the value of the global variable numRedColorMemesL
	 */
	@ReLogoBuilderGeneratedFor("global: numRedColorMemesL")
	public Object getNumRedColorMemesL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRedColorMemesL");
	}

	/**
	 * Sets the value of the global variable numRedColorMemesL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRedColorMemesL")
	public void setNumRedColorMemesL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRedColorMemesL",value);
	}

	/**
	 * Returns the value of the global variable redColorR.
	 *
	 * @return the value of the global variable redColorR
	 */
	@ReLogoBuilderGeneratedFor("global: redColorR")
	public Object getRedColorR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("redColorR");
	}

	/**
	 * Sets the value of the global variable redColorR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: redColorR")
	public void setRedColorR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("redColorR",value);
	}

	/**
	 * Returns the value of the global variable numRedColorMemesR.
	 *
	 * @return the value of the global variable numRedColorMemesR
	 */
	@ReLogoBuilderGeneratedFor("global: numRedColorMemesR")
	public Object getNumRedColorMemesR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRedColorMemesR");
	}

	/**
	 * Sets the value of the global variable numRedColorMemesR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRedColorMemesR")
	public void setNumRedColorMemesR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRedColorMemesR",value);
	}

	/**
	 * Returns the value of the global variable minSizeL.
	 *
	 * @return the value of the global variable minSizeL
	 */
	@ReLogoBuilderGeneratedFor("global: minSizeL")
	public Object getMinSizeL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("minSizeL");
	}

	/**
	 * Sets the value of the global variable minSizeL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: minSizeL")
	public void setMinSizeL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("minSizeL",value);
	}

	/**
	 * Returns the value of the global variable maxSizeL.
	 *
	 * @return the value of the global variable maxSizeL
	 */
	@ReLogoBuilderGeneratedFor("global: maxSizeL")
	public Object getMaxSizeL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("maxSizeL");
	}

	/**
	 * Sets the value of the global variable maxSizeL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: maxSizeL")
	public void setMaxSizeL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("maxSizeL",value);
	}

	/**
	 * Returns the value of the global variable sizeDistrL.
	 *
	 * @return the value of the global variable sizeDistrL
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistrL")
	public Object getSizeDistrL(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeDistrL");
	}

	/**
	 * Sets the value of the global variable sizeDistrL.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistrL")
	public void setSizeDistrL(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeDistrL",value);
	}

	/**
	 * Returns the value of the global variable minSizeR.
	 *
	 * @return the value of the global variable minSizeR
	 */
	@ReLogoBuilderGeneratedFor("global: minSizeR")
	public Object getMinSizeR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("minSizeR");
	}

	/**
	 * Sets the value of the global variable minSizeR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: minSizeR")
	public void setMinSizeR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("minSizeR",value);
	}

	/**
	 * Returns the value of the global variable maxSizeR.
	 *
	 * @return the value of the global variable maxSizeR
	 */
	@ReLogoBuilderGeneratedFor("global: maxSizeR")
	public Object getMaxSizeR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("maxSizeR");
	}

	/**
	 * Sets the value of the global variable maxSizeR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: maxSizeR")
	public void setMaxSizeR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("maxSizeR",value);
	}

	/**
	 * Returns the value of the global variable sizeDistrR.
	 *
	 * @return the value of the global variable sizeDistrR
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistrR")
	public Object getSizeDistrR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("sizeDistrR");
	}

	/**
	 * Sets the value of the global variable sizeDistrR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: sizeDistrR")
	public void setSizeDistrR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("sizeDistrR",value);
	}

	/**
	 * Returns the value of the global variable numOfProtoMemeCreationAttemptsPerStep.
	 *
	 * @return the value of the global variable numOfProtoMemeCreationAttemptsPerStep
	 */
	@ReLogoBuilderGeneratedFor("global: numOfProtoMemeCreationAttemptsPerStep")
	public Object getNumOfProtoMemeCreationAttemptsPerStep(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numOfProtoMemeCreationAttemptsPerStep");
	}

	/**
	 * Sets the value of the global variable numOfProtoMemeCreationAttemptsPerStep.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numOfProtoMemeCreationAttemptsPerStep")
	public void setNumOfProtoMemeCreationAttemptsPerStep(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numOfProtoMemeCreationAttemptsPerStep",value);
	}

	/**
	 * Returns the value of the global variable populationLimit.
	 *
	 * @return the value of the global variable populationLimit
	 */
	@ReLogoBuilderGeneratedFor("global: populationLimit")
	public Object getPopulationLimit(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("populationLimit");
	}

	/**
	 * Sets the value of the global variable populationLimit.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: populationLimit")
	public void setPopulationLimit(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("populationLimit",value);
	}

	/**
	 * Returns the value of the global variable averageLifeSpan.
	 *
	 * @return the value of the global variable averageLifeSpan
	 */
	@ReLogoBuilderGeneratedFor("global: averageLifeSpan")
	public Object getAverageLifeSpan(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("averageLifeSpan");
	}

	/**
	 * Sets the value of the global variable averageLifeSpan.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: averageLifeSpan")
	public void setAverageLifeSpan(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("averageLifeSpan",value);
	}

	/**
	 * Returns the value of the global variable overlapping.
	 *
	 * @return the value of the global variable overlapping
	 */
	@ReLogoBuilderGeneratedFor("global: overlapping")
	public Object getOverlapping(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("overlapping");
	}

	/**
	 * Sets the value of the global variable overlapping.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: overlapping")
	public void setOverlapping(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("overlapping",value);
	}

	/**
	 * Returns the value of the global variable evanescence.
	 *
	 * @return the value of the global variable evanescence
	 */
	@ReLogoBuilderGeneratedFor("global: evanescence")
	public Object getEvanescence(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("evanescence");
	}

	/**
	 * Sets the value of the global variable evanescence.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: evanescence")
	public void setEvanescence(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("evanescence",value);
	}

	/**
	 * Returns the value of the global variable worldWidth.
	 *
	 * @return the value of the global variable worldWidth
	 */
	@ReLogoBuilderGeneratedFor("global: worldWidth")
	public Object getWorldWidth(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("worldWidth");
	}

	/**
	 * Sets the value of the global variable worldWidth.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: worldWidth")
	public void setWorldWidth(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("worldWidth",value);
	}

	/**
	 * Returns the value of the global variable worldHeight.
	 *
	 * @return the value of the global variable worldHeight
	 */
	@ReLogoBuilderGeneratedFor("global: worldHeight")
	public Object getWorldHeight(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("worldHeight");
	}

	/**
	 * Sets the value of the global variable worldHeight.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: worldHeight")
	public void setWorldHeight(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("worldHeight",value);
	}

	/**
	 * Returns the value of the global variable leftActiveEdgeXcor.
	 *
	 * @return the value of the global variable leftActiveEdgeXcor
	 */
	@ReLogoBuilderGeneratedFor("global: leftActiveEdgeXcor")
	public Object getLeftActiveEdgeXcor(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("leftActiveEdgeXcor");
	}

	/**
	 * Sets the value of the global variable leftActiveEdgeXcor.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: leftActiveEdgeXcor")
	public void setLeftActiveEdgeXcor(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("leftActiveEdgeXcor",value);
	}

	/**
	 * Returns the value of the global variable rightActiveEdgeXcor.
	 *
	 * @return the value of the global variable rightActiveEdgeXcor
	 */
	@ReLogoBuilderGeneratedFor("global: rightActiveEdgeXcor")
	public Object getRightActiveEdgeXcor(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("rightActiveEdgeXcor");
	}

	/**
	 * Sets the value of the global variable rightActiveEdgeXcor.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: rightActiveEdgeXcor")
	public void setRightActiveEdgeXcor(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("rightActiveEdgeXcor",value);
	}

	/**
	 * Returns the value of the global variable protoMemesCount.
	 *
	 * @return the value of the global variable protoMemesCount
	 */
	@ReLogoBuilderGeneratedFor("global: protoMemesCount")
	public Object getProtoMemesCount(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("protoMemesCount");
	}

	/**
	 * Sets the value of the global variable protoMemesCount.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: protoMemesCount")
	public void setProtoMemesCount(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("protoMemesCount",value);
	}


}