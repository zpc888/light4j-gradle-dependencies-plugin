package com.prot.gradle.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class Light4jGradlePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getConfigurations().create("light4jCodeGen");
    }
}
