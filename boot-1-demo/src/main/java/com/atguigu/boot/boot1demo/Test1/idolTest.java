package com.atguigu.boot.boot1demo.Test1;

public class idolTest {

    public static void main(String[] args) {
        idol idol = new idol("爱");
        idols proxy = toolUtil.createProxy(idol);
        proxy.sing("好日子");

    }
}
