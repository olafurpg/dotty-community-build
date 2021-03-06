organization in ThisBuild := "ch.epfl.lamp"
scalaVersion in ThisBuild := "2.12.3"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
testOptions in Test += Tests.Argument(TestFrameworks.JUnit)
enablePlugins(BuildInfoPlugin)
buildInfoKeys := Seq[BuildInfoKey](
  "dottyVersion" -> dottyLatestNightlyBuild.get
)
buildInfoPackage := "dotty.communitybuild"
