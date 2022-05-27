package org.shaneking.demo.maven.plugins.echo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.Map;

@Mojo(name = "skEcho", defaultPhase = LifecyclePhase.VERIFY)
//@Execute(phase = LifecyclePhase.VERIFY)//will execute verify before skEcho
public class EchoMojo extends AbstractMojo {

  @Parameter(defaultValue = "", readonly = true)//will null if defaultValue is empty
  private String skString;

//  @Parameter( defaultValue = "${session}", readonly = true )
//  private MavenSession session;

//  @Parameter( defaultValue = "${project}", readonly = true )
//  private MavenProject project;

//  @Parameter( defaultValue = "${mojoExecution}", readonly = true )
//  private MojoExecution mojo;

  @Parameter(defaultValue = "${plugin}", readonly = true)
  private PluginDescriptor plugin;

//  @Parameter( defaultValue = "${settings}", readonly = true )
//  private Settings settings;

  @Parameter(defaultValue = "${project.basedir}", readonly = true)
  private File basedir;

  @Parameter(defaultValue = "${project.build.directory}", readonly = true)
  private File buildDirectory;

  @Parameter(defaultValue = "${project.artifactId}-${project.version}.jar")
  private String jarName;

  @Parameter(defaultValue = "${project.build.finalName}.jar")
  private String finalJarName;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Map<Object, Object> map = this.getPluginContext();
    this.getLog().info("this.getPluginContext():begin!");
    map.entrySet().forEach(e -> {
      this.getLog().info(e.getKey().toString() + "=" + e.getValue().toString());
    });
    this.getLog().info("this.getPluginContext():end!");

    this.getLog().info("maven.variables:begin!");
    this.getLog().info("${project.basedir}=" + basedir);
    this.getLog().info("${project.build.directory}=" + buildDirectory);
    this.getLog().info("${project.artifactId}-${project.version}.jar=" + jarName);
    this.getLog().info("${project.build.finalName}.jar=" + finalJarName);
    this.getLog().info("maven.variables:end!");

    this.getLog().info("user.parameters:begin!");
    this.getLog().info("skString=" + skString);
    this.getLog().info("user.parameters:end!");
  }
}
