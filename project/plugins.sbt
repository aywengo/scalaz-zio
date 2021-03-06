resolvers += Resolver.bintrayRepo("ktosopl", "sbt-plugins/sbt-jcstress")

addSbtPlugin("pl.project13.scala" % "sbt-jmh"                  % "0.3.4")
addSbtPlugin("pl.project13.scala" % "sbt-jcstress"             % "0.2.0")
addSbtPlugin("com.dwijnand"       % "sbt-travisci"             % "1.1.3")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "0.6.26")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.0")
addSbtPlugin("com.47deg"          % "sbt-microsites"           % "0.7.27")
addSbtPlugin("com.geirsson"       % "sbt-scalafmt"             % "1.6.0-RC4")
addSbtPlugin("com.eed3si9n"       % "sbt-buildinfo"            % "0.9.0")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"            % "1.5.1")
addSbtPlugin("com.geirsson"       % "sbt-ci-release"           % "1.2.1")
