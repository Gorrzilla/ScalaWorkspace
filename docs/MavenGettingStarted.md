# Getting Started With Maven

Maven is a Java based tool that can be used to build (and manage) any Java - or Scala - project.

The [Maven in 5 Minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) is an excellent
point of reference for a quick-start guide. 

Fundamentally, there are 2 necessities for a Maven build:

1. [pom.xml](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html#:~:text=A%20Project%20Object%20Model%20or,default%20values%20for%20most%20projects.) 
This is essentially a 'build script' that details the project configuration. This contains things such as
all dependencies required for your project to run, the compiler target and so on...

2. [The Project structure](http://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
Many a frustration trying to debug an issue, only to find it is caused by putting the file in the incorrect place. 

---

## Further Tips

- Don't be intimidated by the pom. Start off simple, and learn the basics before jumping into a complex pom. I would recommend 
creating your poms by scratch initially to understand the concept, before generating templates. 

- The project structure is the same for Scala and Java. 

- All Dependencies in the pom relate to the Java/Scala version. If you have a different version than the 'maven.compiler.source' tag, check the version compatibility at :

[Maven Repository](https://mvnrepository.com/)

- You can use setup Maven projects to work offline (without internet connections) by using [Offline Mode](https://www.oreilly.com/library/view/apache-maven-cookbook/9781785286124/ch08s05.html)

---

## Useful Commands

Below are some of the more common maven commands that I found more useful.
 
### Package Jar without Dependencies



Run the following command (command prompt/bash terminal) in same directory that pom.xml is in:


```maven
mvn clean package
```

 

### Package Jar with Dependencies

 

Run the following command (command prompt/bash terminal) in same directory that pom.xml is in:

 

```maven
mvn clean compile assembly:single
```

 

### Run Jar

Run the following command (command prompt/bash terminal):

```java
java -jar <path to jar>
```