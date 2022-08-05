import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "org.exercism"
ThisBuild / organizationName := "exercism"

lazy val root = (project in file("."))
  .settings(
    name := "TestRunner",
    // not in the Test scope so that it gets added to the fat jar generated by sbt assembly
    libraryDependencies += scalaTest,
    libraryDependencies += "org.json" % "json" % "20220320",
    // for the LensPerson exercise
    libraryDependencies ++= monocle
  )
