package com.tony.lib.PrototypePattern.Deep;

import java.util.ArrayList;

/**
 * Created by Tony on 2018/12/6
 * description: 说明
 * Copyright: Copyright (c) Hori All right reserved
 * version:
 */
public class DeepWordDocument implements Cloneable {
    //文本
    private String text;

    //图片
    private ArrayList<String> images = new ArrayList<String>();

    public DeepWordDocument() {
        System.out.println("---DeepWordDocument 构造函数---");
    }

    @Override
    public DeepWordDocument clone() {
        try {
            DeepWordDocument document = (DeepWordDocument) super.clone();
            document.text = this.text;
            //document.images = this.images;
            //改成深拷贝
            document.images = (ArrayList<String>) this.images.clone();
            return document;

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void addImage(String img) {
        images.add(img);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("---Word content start---");
        System.out.println("Text : " + text);
        System.out.println("images list : ");
        for (String name : images) {
            System.out.println("image name : " + name);
        }
        System.out.println("---Word content end---");
    }
}
