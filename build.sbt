organization := "jp.t2v"

name := "htmlintp"

version := "0.1.0"

scalaVersion := "2.10.2"

crossScalaVersions := Seq("2.10.2")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")

initialCommands in console += {
  Iterator("htmlintp._").map("import "+).mkString("\n")
}

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"
