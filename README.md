PicDNA v0.6
===========
### *A Relogo intelligent<sup>&#42;</sup> agent based simulation*

Tries to gracefully link two randomly generated two-dimensional maps of objects with different shapes, sizes and colors.

In package `picdna.relogo` you will find:

* [UserGlobalsAndPanelFactory](https://github.com/elcodedocle/PicDNA/blob/master/src/picdna/relogo/UserGlobalsAndPanelFactory.groovy) sets the controls you see during the simulation.
* [UserObserver](https://github.com/elcodedocle/PicDNA/blob/master/src/picdna/relogo/UserObserver.groovy) generates the two-dimensional maps.
* [ProtoMeme](https://github.com/elcodedocle/PicDNA/blob/master/src/picdna/relogo/ProtoMeme.groovy) establishes the intelligent agents' behaviour.

Anything else you will see on this repo is pretty much a bunch of tweaks on a default Relogo Framework for Repast Simphony 2 eclipse project.

## How to use

* Clone the repo: `git clone https://github.com/elcodedocle/PicDNA`
* Import the project and run it from eclipse kepler included on [Repast Simphony 2.1](http://sourceforge.net/projects/repast/files/Repast%20Simphony/Repast%20Simphony%202.1/).

OR

* Download the binary installer from https://github.com/elcodedocle/PicDNA/releases
* Run the jar file: `java -jar PicDNA-v0.6-setup.jar`
* Run `start_model.bat` (windows) or `start_model.command` (linux) from selected install dir

(Versions up to v0.5 run nice on [Repast Simphony 2.0](http://sourceforge.net/projects/repast/files/Repast%20Simphony/Repast%20Simphony%202.0/) using [Java SE 6 U31](http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-javase6-419409.html))

## How it looks

It looks different every time! This is a snapshot after a few steps running on default settings:

![Simulation snapshot](http://i.imgur.com/0B8TEpd.png "With default (and boring) settings, it looks somehow like this.")


<div class="reflist" style="list-style-type: decimal;">
<sub>* Intelligent meaning independent state machines that sense and interact with the environment, changing their internal state accordingly, but without any long term memory based learning capacities (as in some sort of combination between reinforcement learning and decision tree machine learning tecniques)<sub>
</div>
