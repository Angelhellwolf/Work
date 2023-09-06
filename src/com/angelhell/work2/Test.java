package com.angelhell.work2;

public class Test {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        // gf1.age = -18; java: age 在 com.angelhell.work2.GirlFriend 中是 private 访问控制
        gf1.setAge(18);

        System.out.print(gf1.getAge());
    }
}
