# How To Build

 

## Development Environment

- Apache Maven 3.6.3

- Java 1.8.0_251

- Scala 2.13.1

 

All Dependencies relate to the Scala version. If you have a different scala version, check the necessary jar files at:

[Maven Repository](https://mvnrepository.com/)

 

 

## Package Jar with Dependencies

 

Run the following command (command prompt/bash terminal) in same directory that pom.xml is in:

 

```maven

mvn clean compile assembly:single

```

 

## Run Jar

Run the following command (command prompt/bash terminal):

```java

java -jar <path to jar>

```