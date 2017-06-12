package com.zhangyong.tiny;

/**
 * Author：zhangyong on 2017/6/9 14:52
 * Email：zhangyonglncn@gmail.com
 * Description：
 */

public class TinyPngInfo {

    String path
    String preSize;
    String postSize
    String md5

    TinyPngInfo() {
    }

    TinyPngInfo(String path, String preSize, String postSize, String md5) {
        this.path = path
        this.preSize = preSize
        this.postSize = postSize
        this.md5 = md5
    }


}
