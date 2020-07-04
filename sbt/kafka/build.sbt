name := "KafkaConnector"
version := "0.1"
scalaVersion := "2.13.3"
useCoursier := false
libraryDependencies ++= Seq(
  "org.apache.kafka" %% "kafka" % "2.5.0",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
