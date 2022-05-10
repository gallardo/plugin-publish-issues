package io.github.gallardo.publishpluginissues


import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin

class ExamplePlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {
        project.getPluginManager().apply(JavaPlugin.class)
        project.task('exampleTask') {
            group = 'agallardo example'
            description = 'Learning writing gradle plugin in groovy'
            doLast {
                logger.lifecycle("This is my example task running!")
            }
        }
    }
}
