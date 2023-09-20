import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候，不需要用变量接受结果,可以继续调用其他方法

        int length = getString().substring(1).replace("A", "Q").length();
        System.out.println(length);

    }


    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        return sc.next();
    }
}
