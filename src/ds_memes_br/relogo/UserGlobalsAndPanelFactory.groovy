package ds_memes_br.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory
/**
 * PicDNA Globals and Panel
 * Creator: Gael Abadin
 * Version: 0.5
 *-----------------------------------------------------------------------------
 *  Copyright (C) 2012-2013 Gael Abadin
 *-----------------------------------------------------------------------------
 */
public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
    public void addGlobalsAndPanelComponents(){

        /**
         * Uncomment by removing "//" below to include ReLogo Tick Display
         */
        //addReLogoTickCountDisplay()

        /**
         * Place custom panels and globals below, for example:
         * 
         addButtonWL("setup","Setup") 	// Button with label ( method name, button label )
         addButton("action1")			// Button without label ( method name )
         addToggleButtonWL("go","Go")	// Toggle Button with label ( method name, button label )
         addToggleButton("action2")		// Toggle Button without label  ( method name )
         addGlobal("globalVariable1")	// Globally accessible variable ( variable name)
         // Slider with label ( variable name, slider label, minimum value, increment, maximum value, initial value )
         addSliderWL("sliderVariable", "Slider Variable", 0, 1, 10, 5)
         // Slider without label ( variable name, minimum value, increment, maximum value, initial value )
         addSlider("sliderVariable2", 0.2, 0.1, 0.8, 0.5)
         // Chooser with label  ( variable name, chooser label, list of choices , zero-based index of initial value )
         addChooserWL("chooserVariable", "Chooser Variable", ["yes","no","maybe"], 2)
         // Chooser without label  ( variable name, list of choices , zero-based index of initial value )
         addChooser("chooserVariable2", [1, 66, "seven"], 0)
         */

        addButtonWL("setup","Setup")
        addButtonWL("go","Go Once")
        addToggleButtonWL("go","Go")
        //addSliderWL("worldWidth","World width",27,6,195,51)
        //addSliderWL("worldHeight","World height",9,2,65,17)
        addSliderWL("minHorizon","Horizon [Agents' Initial (and Minimum) Range of Sight]",0,1,33,3)
        addChooserWL("lockHorizon","Lock Horizon Values", ["Yes", "No"], 1)
        addChooserWL("movementHeuristic","Use Movement Heuristic", ["Yes", "No"], 0)
        addSliderWL("movementStep","Movement Step",0,0.5,2,1)
        addSliderWL("dirRandomness","Direction Randomness",0,0.01,1,0)
        addChooserWL("shapeHeuristic","Use Shape Shift Heuristic", ["Yes", "No"], 1)
        addSliderWL("shapeRandomness","Use Shape Shift Randomness",0,0.01,1,0)
        addChooserWL("colorHeuristic","Use Color Shift Heuristic", ["Yes", "No"], 1)
        addSliderWL("colorRandomness","Color Shift Randomness",0,0.01,1,0)
        addChooserWL("sizeHeuristic","Use Size Change Heuristic", ["Yes", "No"], 1)
        addSliderWL("sizeStep","Size Step",0,0.01,1,1)
        addSliderWL("minSize","Minimum Size",1,1,10,2)
        addSliderWL("maxSize","Maximum Size",1,1,10,3)
        addChooserWL("sizeDistr","Size Distribution", [
            "mostly big",
            "even",
            "mostly small"
        ], 1)
        addSliderWL("sizeRandomness","Size Change Randomness",0,0.01,1,0)
        addChooserWL("useDistance","Use distance to in-range agents in heuristics", ["Yes", "No"], 0)
        addChooserWL("useSize","Use size of in-range agents in heuristics", ["Yes", "No"], 0)
        addChooserWL("useLocked","Direct influence in heuristics (when in-range) of left side and right side agents", ["Yes", "No"], 1)
        addSliderWL("numLeftMemes","Number of Left Side Memes",1,1,200,50)
        addSliderWL("numRightMemes","Number of Right Side Memes",1,1,200,50)
        addSliderWL("circleL","Left Side Circle Memes Out of Total Factor",0,0.1,1,1)
        addGlobal("numCircleMemesL")
        addSliderWL("circleR","Right Side Circle Memes Out of Total Factor",0,0.1,1,0)
        addGlobal("numCircleMemesR")
        addSliderWL("redColorL","Left Side Red Memes Out of Total Factor",0,0.1,1,1)
        addGlobal("numRedColorMemesL")
        addSliderWL("redColorR","Right Side Red Memes Out of Total Factor",0,0.1,1,0)
        addGlobal("numRedColorMemesR")
        addSliderWL("minSizeL","Minimum Size of Left Side Memes",1,1,10,3)
        addSliderWL("maxSizeL","Maximum Size of Left Side Memes",1,1,10,3)
        addChooserWL("sizeDistrL","Size Distribution of Left Side Memes", [
            "mostly big",
            "even",
            "mostly small"
        ], 1)
        addSliderWL("minSizeR","Minimum Size of Right Side Memes",1,1,10,2)
        addSliderWL("maxSizeR","Maximum Size of Right Side Memes",1,1,10,2)
        addChooserWL("sizeDistrR","Size Distribution of Right Side Memes", [
            "mostly big",
            "even",
            "mostly small"
        ], 1)
        addSliderWL("numOfProtoMemeCreationAttemptsPerStep","Number of Meme generation attempts in Active (middle) Area per Step",0,1,20,1)
        addSliderWL("populationLimit","Population Limit",1,1,400,50)
        addSliderWL("averageLifeSpan","Average lifespan (steps)",1,10,10000,100)
        addSliderWL("overlapping","Influence factor in heuristics from overlapping maps of L and R agents in active (middle) area",0,0.01,1,0.5)
        addSliderWL("evanescence","Evanescence factor of overlapping maps towards the opposite edge",0,0.01,1,0.5)
        addMonitorWL("remainingprotoMemes","Memes Count",1)
        addMonitorWL("remainingredMemes","Red Memes Count",1)
        addMonitorWL("remainingblueMemes","Blue Memes Count",1)
        addMonitorWL("remainingcircleMemes","Circle Memes Count",1)
        addMonitorWL("remainingsquareMemes","Square Memes Count",1)
        addMonitorWL("remainingredcircleMemes","Red Circle Count",1)
        addMonitorWL("remainingredsquareMemes","Red Square Count",1)
        addMonitorWL("remainingbluecircleMemes","Blue Circle Memes Count",1)
        addMonitorWL("remainingbluesquareMemes","Blue Square Memes Count",1)
        addGlobal("worldWidth")
        addGlobal("worldHeight")
        addGlobal("leftActiveEdgeXcor")
        addGlobal("rightActiveEdgeXcor")
        addGlobal("protoMemesCount")
    }
}