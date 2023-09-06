package com.angelhell.work2;

public class GirlFriend {
    // private 被private修饰的成员只能在本类中才能访问
    private String name;

    //成员变量
    private int age;

    //public 公共的 公开的
    public void setAge(int age) {
        // this. 当成员变量和局部变量重合，处罚就近原则，谁离我近就用谁。 用this则直接用成员变量
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge() {
        return age;
    }

    private String gender;
}
