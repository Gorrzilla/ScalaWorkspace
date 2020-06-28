# Scala Workspace

Recently I was looking into how to build stand-alone executable JAR files using Scala source files. This was desirable for a single reason:

1. Portability - Scala code compiled into a JAR means that other users do not have to have Scala installed to be able to run.
 Instead it runs on the JVM, which is more common to have installed.
 
 There are lots of guides available on the internet that detail this process, however they all do things slightly differently
 depending on your IDE (Eclipse/IntelliJ/VSCode) and your build tool (SBT/Maven/Gradle)
 
 
 ---
 ## Development Environment
 This work in this repository will mainly focus around how to build JAR Files using the following development environment:
 - Basic Code Editor with Scala linting (VSCode with Metals plugin)
 https://scalameta.org/metals/docs/editors/vscode.html
 
 - Maven (Command Line Only)
 https://maven.apache.org/
 
 - Scala (REPL Binaries only)
 https://www.scala-lang.org/
 
 This is a minimum install of tools required to meet the objective. 
 
 ---
