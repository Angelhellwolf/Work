package com.angelhell.work9;

import java.util.Scanner;

public class PhoneTest {
    static Scanner sc = new Scanner(System.in);
    static Phone[] arr = new Phone[3];
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 6999.99 ,"白色");
        Phone p2 = new Phone("华为", 6999.99 ,"白色");
        Phone p3 = new Phone("ViVO", 6999.99 ,"白色");
        double average = (p1.getPrice() + p2.getPrice() + p3.getPrice()) / arr.length;
        System.out.println(average);
    }
}
