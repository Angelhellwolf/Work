package com.angelhell.work1;

public class PhoneTest {
    public static void main(String[] args){
        //描述一类事物的叫做 javabean类
        //不写main方法 编写属性与行为
        //成员变量 (代表属性)
        //成员方法 (代表行为)
        //一个Java文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须是代码的文件名


        //编写main方法的类 叫做测试类



        //类是共同特征的描述 对象是存在具体的实例
        //成员变量 代表属性 一般是名词
        //成员方法 代表行为的 一般是动词
        //类名 对象名 = new 类名();

        //创建对象
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.98;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
