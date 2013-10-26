import de.johoop.jacoco4sbt._
import JacocoPlugin._

organization := "com.github.jedesah"

name := "codesheet-api"

versionWithGit

scalaVersion := "2.10.3"

publishTo := Some(Resolver.file("Github Pages", 
	Path.userHome / "Repo" / "project" / "log4900.github.com" / "maven" asFile)(
		Patterns(true, Resolver.mavenStyleBasePattern)
	)
)

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.10.3"

libraryDependencies += "org.specs2" %% "specs2" % "2.2.3" % "test"

jacoco.settings

//scalacOptions ++= Seq("-feature")