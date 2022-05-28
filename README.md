# org.shaneking.demo.maven.plugins
Maven Plugins Demo

## org.shaneking.demo.maven.plugins.echo
echo something.

## org.shaneking.demo.maven.plugins.test
testing echo plugin.
```
[INFO] this.getPluginContext():begin!
[INFO] project=MavenProject: org.shaneking.demo:org.shaneking.demo.maven.plugins.test:0.0.1-SNAPSHOT @ /Users/github/ShaneKingBlog/org.shaneking.demo.maven.plugins/org.shaneking.demo.maven.plugins.test/pom.xml
[INFO] pluginDescriptor=Component Descriptor: role: 'org.apache.maven.plugin.Mojo', implementation: 'org.shaneking.demo.maven.plugins.echo.EchoMojo', role hint: 'org.shaneking.demo:org.shaneking.demo.maven.plugins.echo:0.0.1-SNAPSHOT:skEcho'
---
[INFO] this.getPluginContext():end!
[INFO] maven.variables:begin!
[INFO] ${project.basedir}=/Users/github/ShaneKingBlog/org.shaneking.demo.maven.plugins/org.shaneking.demo.maven.plugins.test
[INFO] ${project.build.directory}=/Users/github/ShaneKingBlog/org.shaneking.demo.maven.plugins/org.shaneking.demo.maven.plugins.test/target
[INFO] ${project.artifactId}-${project.version}.jar=org.shaneking.demo.maven.plugins.test-0.0.1-SNAPSHOT.jar
[INFO] ${project.build.finalName}.jar=org.shaneking.demo.maven.plugins.test-0.0.1-SNAPSHOT.jar
[INFO] maven.variables:end!
[INFO] user.parameters:begin!
[INFO] skString=skTestString
[INFO] user.parameters:end!
```
