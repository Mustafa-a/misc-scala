name := "misc-scala"

version := "0.0.3"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0",
  "com.novocode"           %  "junit-interface"          % "0.11"   % Test,
  "org.scalatest"          %% "scalatest"                % "3.0.5"  % Test,
  "org.scalacheck"         %% "scalacheck"               % "1.13.5" % Test
)
