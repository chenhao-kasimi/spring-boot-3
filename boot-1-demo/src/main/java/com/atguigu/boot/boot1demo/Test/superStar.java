package com.atguigu.boot.boot1demo.Test;

//1.创建一个需要被代理的类
//3.java生成代理的约定：被代理类也需要继承创建的接口
public class superStar implements star{
    private String name;

    public superStar(String name){
        this.name=name;
    }

    public String sing(String name){
        System.out.println(this.name+"在唱"+name);
        return "谢谢";
    }

    public void dance(String name){
        System.out.println(this.name+"在跳"+name);
    }


}
