ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-core" % "1.2.1" % "provided",
  "org.scala-lang" % "scala-library" % "2.13.6"
)

lazy val root = (project in file("."))
  .settings(
    name := "ips-count"
  )

