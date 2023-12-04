package com.atguigu.boot.boot1demo.Test1;

public class idol implements idols{
    public String name;

    public idol(String name){
        this.name=name;
    }

    public String sing(String name){
        System.out.println(this.name+"唱");
        return "谢谢";
    }
    public void dance(String name){
        System.out.println(this.name+"跳");
    }
}
