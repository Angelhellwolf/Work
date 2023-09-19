package com.angelhell.work8;

import com.angelhell.work7.Goods;

import java.util.Scanner;

public class CarTest {
    static Scanner sc = new Scanner(System.in);
    static Car[] cars = new Car[3];
    static int input = 0;
    public static void main(String[] args) {
        for(int i = 0;i < 3; i++) {
            System.out.println("请输入汽车的名字");
            String name = sc.next();
            System.out.println("请输入汽车的价格");
            double price = sc.nextDouble();
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            input(name, price, color);
        }
        for (Car c1 : cars) {
            //i 索引 arr[i] 数组里的元素
            System.out.println(c1.getColor() + ", " + c1.getName() + ", " + c1.getColor());
        }
    }
    public static void input(String name, double price,String color){
        Car car = new Car(name, price, color);
        cars[input] = car;
        input ++;
    }
}
