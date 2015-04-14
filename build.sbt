lazy val root = (project in file(".")).
  settings(
    name := "hello_world",
    scalaVersion := "2.11.6", /* had to add this or sbt would build against old version */
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
  )

