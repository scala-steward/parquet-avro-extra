addSbtPlugin("com.github.sbt" % "sbt-avro" % "3.4.3")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.1")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.8")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.21")

libraryDependencies += "org.apache.avro" % "avro-compiler" % "1.11.2"
