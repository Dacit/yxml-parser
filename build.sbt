ThisBuild / organization := "de.qaware"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.10"

ThisBuild / javaOptions += "-Xss64m"

ThisBuild / Compile / run / fork := true

// Parallel execution causes logging issues
ThisBuild / Test / parallelExecution := false

lazy val `yxml-parser` = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "com.github.scopt" %% "scopt" % "3.7.1",
      "com.github.pathikrit" %% "better-files" % "3.8.0",
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
      "com.lihaoyi" %% "fastparse" % "2.1.3",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
      "org.apache.logging.log4j" % "log4j-api" % "2.12.1",
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.12.1",
      "org.apache.logging.log4j" % "log4j-core" % "2.12.1",
      "org.scalatest" %% "scalatest" % "3.0.8" % "test"
    ))
