package com.tony.lib.PrototypePattern;

import com.tony.lib.PrototypePattern.Deep.DeepWordDocument;
import com.tony.lib.PrototypePattern.Shallow.ShallowWordDocument;

/**
 * Created by Tony on 2018/12/6
 * description: 说明
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class Test {
    public static void main(String[] args) {
        //浅拷贝
        /*//文档1
        ShallowWordDocument doc1 = new ShallowWordDocument();
        doc1.setText("这是一篇文档");
        doc1.addImage("图片1");
        doc1.addImage("图片2");
        doc1.addImage("图片3");
        doc1.showDocument();

        //把文档1克隆给文档2
        ShallowWordDocument doc2 = doc1.clone();
        doc2.showDocument();

        //修改文档2的内容
        doc2.setText("这是修改过的文档");
        doc2.addImage("图片4");

        //打印文档2的内容
        doc2.showDocument();

        //打印文档1的内容
        doc1.showDocument();*/

        //深拷贝
        //文档1
        DeepWordDocument doc1 = new DeepWordDocument();
        doc1.setText("这是一篇文档");
        doc1.addImage("图片1");
        doc1.addImage("图片2");
        doc1.addImage("图片3");
        doc1.showDocument();

        //把文档1克隆给文档2
        DeepWordDocument doc2 = doc1.clone();
        doc2.showDocument();

        //修改文档2的内容
        doc2.setText("这是修改过的文档");
        doc2.addImage("图片4");

        //打印文档2的内容
        doc2.showDocument();

        //打印文档1的内容
        doc1.showDocument();
    }
}
