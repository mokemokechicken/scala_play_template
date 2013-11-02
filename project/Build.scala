import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {
  val appName         = "My first application"
  val appVersion      = "2.1"
  val appDependencies = Nil
  val main = PlayProject(
    appName, appVersion, appDependencies, mainLang = SCALA
  )
}
