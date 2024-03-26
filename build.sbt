
val toolkitV = "0.2.0"
val toolkit = "org.scala-lang" %% "toolkit" % toolkitV
val toolkitTest = "org.scala-lang" %% "toolkit-test" % toolkitV

ThisBuild / scalaVersion := "3.3.0"
libraryDependencies += toolkit
libraryDependencies += (toolkitTest % Test)
libraryDependencies ++= Seq(
        "dev.zio" %% "zio-kafka" % "2.0.0-M3",
        "dev.zio" %% "zio-json" % "0.3.0-RC7"
      )