version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.10"

name := "Spark Demo"

assembly / assemblyJarName := "spark-demo-fatty-1.0.jar"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.14" % "test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "org.slf4j" % "slf4j-api" % "2.0.5",
  "org.apache.spark" % "spark-sql_2.13" % "3.3.1"% "provided",
  "org.apache.spark" % "spark-core_2.13" % "3.3.1" % "provided",
  "ch.qos.logback" % "logback-classic" % "1.4.5" % "provided")