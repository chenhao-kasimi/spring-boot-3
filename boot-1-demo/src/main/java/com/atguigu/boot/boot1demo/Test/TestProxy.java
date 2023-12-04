package com.atguigu.boot.boot1demo.Test;

public class TestProxy {
    public static void main(String[] args) {
        superStar superStar = new superStar("杨超越");
        star proxy = ProxyUtil.createProxy(superStar);
        System.out.println(superStar.getClass());
        System.out.println(proxy.getClass());
        proxy.sing("好日子");
        proxy.dance("天鹅湖");

    }
}
