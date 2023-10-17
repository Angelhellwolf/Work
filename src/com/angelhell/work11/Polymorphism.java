package com.angelhell.work11;

import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //编译看这左边 运行看右边
        a.eat();

        //多态的弊端 不能调用子类的特有功能
        //父类没有就直接报错
        //a.lookHome();
        //变回子类类型就可以了，细节转换的时候不能瞎转，如果转化成其他类会报错
        Dog d = (Dog) a;

        ((Dog) a).lookHome();
        //判断 使用 instanceof判断下
//        if(d instanceof Dog)
    }
}

class Animal {
    public void eat() {
        System.out.printf("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.printf("狗吃骨头");
    }

    public void lookHome() {
        System.out.printf("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.printf("猫吃鱼竿");
    }

    public void catchMouse() {
        System.out.printf("猫捉老鼠");
    }
}
