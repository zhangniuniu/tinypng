package com.zhangyong.tiny

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Author：zhangyong on 2017/6/9 10:18
 * Email：zhangyonglncn@gmail.com
 * Description：
 */

public class TinyPngPlugin implements Plugin<Project> {

    public static final String sPluginExtensionName = "tinyInfo";

    @Override
    public void apply(Project project) {


        applyExtension(project);

        applyTask(project);

    }

    //Plugin对应gradle文件中的ext拓展
    private void applyExtension(Project project) {
        project.extensions.create(sPluginExtensionName, TinyExtention)
    }

    //Plugin应用的Task
    private void applyTask(Project project) {
        project.afterEvaluate {
            project.tasks.create("tinyPng",TinyPngTask);
            project.tasks.create("unTinyAll",UnTinyTask)
        }

    }


}
