package com.kylemoore;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.JavaExec;

public class UserInteractionPlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    project.getTasks().create("askMe", JavaExec.class, task -> {
      task.setMain("com.kylemoore.UserInteraction");
      task.setClasspath(project.files("buildSrc/build/libs/buildSrc.jar"));
      task.setGroup("Demonstration");
      task.setDescription("A simple example of user interaction via a Gradle task");
    });
  }
}
