import sbt._

object Dependencies {
  val monocleVersion = "2.0.0"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.10"

  lazy val monocleCore = "com.github.julien-truffaut" %%  "monocle-core"  % monocleVersion
  lazy val monocleMacro = "com.github.julien-truffaut" %%  "monocle-macro"  % monocleVersion
}

// libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.28"
