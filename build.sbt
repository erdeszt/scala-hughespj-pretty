lazy val strictlyPretty = Project("hughespj-pretty", file("."))
    .settings(
      name := "hughespj-pretty",
      version := "0.1",
      scalaVersion := "2.12.7",
      testFrameworks += new TestFramework("utest.runner.Framework"),
      bintrayRepository := "io.github.erdeszt",
      organization := "io.github.erdeszt",
      publishMavenStyle := true,
      licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
      libraryDependencies ++= Seq(
        "org.typelevel" %% "spire" % "0.14.1",
        "com.lihaoyi" %% "utest" % "0.6.5" % Test
      )
    )
