package com.angelhell.work12.test;

import com.angelhell.work12.domain.Teacher;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);


        System.out.printf(s.getName() + s.getAge());
        Teacher teacher = new Teacher();
        teacher.setAge(46);
        teacher.setName("李四");

        System.out.printf(teacher.getName() + teacher.getAge());
    }
}
