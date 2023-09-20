package com.angelhell.work10;

import java.util.Objects;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    static Student[] arr = new Student[3];
    static int flag = 0;

    public static void main(String[] args) {
//        studentJoin(1,"heima002",18);
        for(int i = 0;i<arr.length;i++){
            System.out.println("请输入学生的ID");
            int id =sc.nextInt();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            studentJoin(id,name,age);
        }
        System.out.println("请输入删除的学生ID");
        int removeId = sc.nextInt();
        int tempI = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == removeId){
                removeId(removeId);
            }
            tempI++;
            if(tempI == arr.length){
                System.out.println("删除失败");
                tempI = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i].getName(), "heima002")){
                arr[i].setAge(arr[i].getAge() + 1);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }else{
                System.out.println(arr[i] + "无数据");
            }
        }

//        Student s1 = new Student(1,"王淼",18);
//        arr[0] = s1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != null) {
//                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
//            }else {
//                System.out.println("无数据");
//            }
//        }
    }
    public static void studentJoin(int id,String name,int age){
        Student s = new Student(id, name, age);
        arr[flag] = s;
        flag ++;
    }
    public static void removeId(int id){
        for (int i = 0;i < arr.length;i++) {
            if(arr[i] != null){
            if (arr[i].getId() == id) {
                System.out.println("删除成功");
                arr[i] = null;
            }}
        }
    }
}
