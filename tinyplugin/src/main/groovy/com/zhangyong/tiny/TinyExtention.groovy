package com.zhangyong.tiny

import org.gradle.api.Project;

/**
 * Author：zhangyong on 2017/6/9 10:25
 * Email：zhangyonglncn@gmail.com
 * Description：
 */

public class TinyExtention {

    String apiKey
    ArrayList<String> whiteList;
    ArrayList<String> resourceDir;
    ArrayList<String> resourcePattern;

    public TinyExtention() {
        apiKey = ""
        whiteList = []
        resourceDir = []
        resourcePattern = []
    }

    public static TinyExtention getConfig(Project project) {
        TinyExtention config =
                project.getExtensions().findByType(TinyExtention.class);
        if (config == null) {
            config = new TinyExtention();
        }
        return config;
    }

    @Override
    public String toString() {
        return "TinyPngExtension{" +
                "apiKey='" + apiKey + '\'' +
                ", whiteList=" + whiteList +
                ", resourceDir=" + resourceDir +
                ", resourcePattern=" + resourcePattern +
                '}';
    }
}
