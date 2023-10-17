public class Student {
    private String name;
    private int age;
    {
        System.out.println("这是构造代码块 可以把多个构造方法中重复的代码抽取出来，创建本来对象的时候先执行构造代码块，在执行方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
