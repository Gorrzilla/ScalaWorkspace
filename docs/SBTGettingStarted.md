# Getting Started With sbt

Similar to Maven, sbt is a tool used to build (and manage) primarily any Scala project, but it does also support mixed Java/Scala

The [sbt by example](https://www.scala-sbt.org/1.x/docs/sbt-by-example.html) is a reference article that demonstrates through examples alone 
how the tool works, rather than focussing on the how or why. 

Fundamentally, there are 2 necessities for a sbt build:

1. [build.sbt](https://www.scala-sbt.org/1.x/docs/Basic-Def.html)
This is a build script (akin to Mavens pom.xml) that details the project configuration. This contains things such as 
all dependencies required for your project to run, the compiler target and so on...

2. [The Project structure](https://www.scala-sbt.org/1.x/docs/Directories.html)
This is the same directory structure that Maven dictates - Still annoying trying to debug something as simple as this.

A unique characteristic of sbt is the interactive shell. This allows for:

- Continuous compilation, testing, and deployment

- Incremental testing and compilation (only changed sources are re-compiled, only affected tests are re-run etc.)

---

## Further Tips

- sbt comes packaged with a version of Scala, but you can manually install other versions of Scala through the binaries and 
simply tell sbt to use that new version in the build.sbt

- 

---

## Useful Commands

Below are some of the more common sbt commands that I found more useful. 

Note that each of these commands should be run inside sbt.

### Run an application

```scala
run
```

### Automatically Recompile every time source file changes

```scala
~compile
```

### Automatically run incremental tests

```scala
~testQuick
```


