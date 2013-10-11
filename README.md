PicDNA v0.5.2
=============
### *A ReLogo intelligent<sup>&#42;</sup> agent based simulation*

Tries to gracefully link two randomly generated two-dimensional maps of objects with different shapes, sizes and colors.

In package `picdna.relogo` you will find:

* [UserGlobalsAndPanelFactory](https://github.com/elcodedocle/PicDNA/blob/v0.5/src/ds_memes_br/relogo/UserGlobalsAndPanelFactory.groovy) sets the controls you see during the simulation
* [UserObserver](https://github.com/elcodedocle/PicDNA/blob/v0.5/src/ds_memes_br/relogo/UserObserver.groovy) generates the two-dimensional maps
* [ProtoMeme](https://github.com/elcodedocle/PicDNA/blob/v0.5/src/ds_memes_br/relogo/ProtoMeme.groovy) establishes the intelligent agents' behavior

Anything else you will see on this repo is pretty much a bunch of tweaks on a default Relogo Framework for Repast Simphony 2.0 eclipse project.

## How to use

* Install [Repast Simphony 2.0](http://sourceforge.net/projects/repast/files/Repast%20Simphony/Repast%20Simphony%202.0/)
* Clone the repo on Repast Simphony 2.0 bundled Eclipse workspace: `git clone https://github.com/elcodedocle/PicDNA -b v0.5 DS_memes_BR`
* Create a new ReLogo project on Repast Simphony 2.0 bundled Eclipse named `DS_memes_BR` (`File->new->ReLogo Project`)
* Run the simulation from Eclipse (`CTRL+F11`)

Versions up to v0.5 run nice on [Repast Simphony 2.0](http://sourceforge.net/projects/repast/files/Repast%20Simphony/Repast%20Simphony%202.0/) using [Java SE 6 U31](http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-javase6-419409.html)

## How it looks

It looks different every time! This is a snapshot after a few steps running on default settings:

![Simulation snapshot](http://i.imgur.com/TX31zGx.png "With default (and boring) settings, it looks somehow like this.")

## How it works

The first approach was:

Pressing power and then `Setup` button does the following setup:

* Divide the whole 2D-world area horizontally into three parts of equal size
* Generate two static random maps, one on the left side and one on the right side, represented by locked (passive, never change their position, shape, color or size) visible agents
* Make a hidden superposition of both maps in the middle area (by cloning left and right agents on their relative positions and setting their visibility to hidden)

After this, the simulation runs by pressing `Go` button for continuous playback or `Step` button for one-step playback.

Then, on each step:

* Generate a random number of dynamic (can move along the middle area, have a random lifespan) agents at random positions with random color/shape/size on the middle area
* Passive hidden agents on middle area act as attractors/repellers of dynamic agents with similar/different properties (size/color/shape)
* Passive, not hidden, agents on left and right areas and active (dynamic) agents on middle area act as repellers/attractors of dynamic agents with similar/different properties (like magnets, just the opposite from above)
* Active agents who have reached their (random) step lifespan die

Only one extra feature was later added to this approach:

* Apart from their position, active (dynamic) agents can change their other properties (color/shape/size) on each step to better fit their environment according to the previously defined rules

Also, many controls were added to allow runtime modification of the weights, randomness and random distributions of the behavior-defining heuristics associated with each property of the agents (color/shape/size/position).

## TODO

* Use simpler and more visually recognizable patterns in left and right Maps generation<sup>**</sup>
* Dynamic lifespan (when a dynamic agent is in a good/bad environment its lifespan increases/decreases)

<p><sub>* <i>Intelligent</i> meaning independent state machines that sense and interact with the environment, changing their internal state accordingly, but without any long term memory based learning capacities (as in some sort of combination between reinforcement learning and decision tree machine learning techniques)</sub>
<br><sub>** Rather than just taking samples from common probability distributions, in order to easily appreciate how the agents combine both maps' properties generating an original brand new pattern which, under these conditions, should also be easily recognizable when looking at the simulation output.</sub></p>
