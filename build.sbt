val scala3Version = "3.1.3"

inThisBuild(
  List(
    semanticdbEnabled := true
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    scalacOptions += "-Xcheck-macros",

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.github.rssh" %% "dotty-cps-async" % "0.9.9"
  )
