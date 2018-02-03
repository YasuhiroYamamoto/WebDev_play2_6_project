name := "WebDev_play2_6_project"
 
version := "1.0" 
      
lazy val `webdev_play2_6_project` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  jdbc ,
  ehcache ,
  ws ,
  specs2 % Test ,
  guice ,
  "mysql" % "mysql-connector-java" % "5.1.45" ,
  "org.webjars" %% "webjars-play" % "2.6.1",
  "com.typesafe.play" %% "play-slick" % "3.0.2",
  "com.typesafe.slick" %% "slick-codegen" % "3.2.1",
  "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B3" ,
  "org.webjars" % "jquery" % "3.2.1"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )