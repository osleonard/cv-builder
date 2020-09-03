import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.osleonard"
ThisBuild / organizationName := "osleonard"

lazy val root = (project in file("."))
  .settings(
    name := "cv-builder",
    libraryDependencies ++= Vector(
      circeYaml,
      circeGeneric,
      scalaTest % Test
    )
  )