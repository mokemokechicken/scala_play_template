import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName         = "My first application"
  val appVersion      = "2.2"
  val appDependencies = Nil
  val main = PlayProject(
    appName, appVersion, appDependencies, mainLang = SCALA
  )
}
