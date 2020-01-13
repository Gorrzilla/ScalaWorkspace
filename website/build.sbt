name := "Automation Website"
version := "0.1"
scalaVersion := "2.11.12"                  

//plugins
enablePlugins(ScalaJSPlugin)

// scala JS
scalaJSUseMainModuleInitializer := true  

//Dependencies
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"
