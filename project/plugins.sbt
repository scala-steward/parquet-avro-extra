addSbtPlugin("com.github.sbt" % "sbt-avro" % "3.5.0")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.4.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.1.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.11.3")

libraryDependencies += "org.apache.avro" % "avro-compiler" % "1.11.3"
