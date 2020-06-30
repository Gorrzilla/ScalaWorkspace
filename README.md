# Scala Workspace

---

I have recently been looking to relieve my boredom whilst learning something new, and one of the ways to do that is to learn an entirely new language! 
I had previous experience of Object Oriented Programming, and the common theme across all the literature that I'd been reading was that a-lot of the recent features (XP, TDD etc) in programming
were firmly intertwined with Java. 

I did some research and stumbled across this language called [Scala](https://www.scala-lang.org/) that I liked the look of. It turned out that many popular tools (Apache Flink, Apache Spark)
that I had heard of were also developed in Scala. Aware of the knowledge that there would soon be opportunities to expand this into the office, this repository was born!

---

## What to Expect

This repository will house all the development I do whilst I learn the language and (hopefully) progressively improve the complexity and quality of the code. This is a journey! 

Some things you can expect from each example developed:

1. **Tests** - I aim to follow [Test Driven Development](http://agiledata.org/essays/tdd.html), and as such I will attempt to produce tests at all appropriate levels, 
from Unit Test Level, to [Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development) level, to system and integration testing where required.

2. **Build Management** - *Portability* - Code compiled into a JAR means that other users do not have to have Scala installed to be able to run. Instead it runs on the JVM, which is more common to have installed.
There are multiple tools available to help manage dependencies, and I will use a combination to learn how they work!

There are lots of guides available on the internet that detail these two steps in varying levels of detail, however they all do things slightly differently
depending on your IDE (Eclipse/IntelliJ/VSCode) and your build tool (SBT/Maven/Gradle).
 
 If you stumble across this repository, please do feel free to offer suggestions on how I can improve something - We're all here to learn, and I often find that doing something alone only compounds the mistakes!
 
 ---
 
 ## Development Environment
 
 This work in this repository will mainly focus around how to build JAR Files using the following tooling:
 
 - [IntelliJ Community Edition with Scala Plugin](https://www.jetbrains.com/idea/)
	Installed: 2020.1.2 (Community Edition)
	
 - [Java Development Kit](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)
    Installed: JDK 14.0.1
 
 - [Scala](https://www.scala-lang.org/)
    Installed: Scala 2.13.3
	
 - [Maven](https://maven.apache.org/)
	Installed: Maven 3.6.3
	
 - [sbt](https://www.scala-sbt.org/)
    Installed: sbt 1.3.4
 
I had originally attempted to just use a lightweight IDE like VSCode with the Metals plugin, however I found there were recurring issues, such as not starting the sbt server correctly,
importing builds incorrectly, and occasionally the linting wasn't working correctly.
 
 
 ---

## Getting Started With The Build Tools

Originally it was intended to use Maven for this purpose, however the 
general concensus is that Maven attempts to be ‘the best of both worlds' facilitating both Scala and Java, whereas sbt is singularly [focussed](https://stackoverflow.com/questions/11277967/pros-and-cons-of-using-sbt-vs-maven-in-scala-project).

Coupled with the knowledge that both tools have access to the same libraries, there is limited drawback beyond the initial learning curve.

 - [Maven](docs/MavenGettingStarted.md)
 
 - [sbt](docs/SBTGettingStarted.md)