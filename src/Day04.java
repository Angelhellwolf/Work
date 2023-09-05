import java.util.Scanner;

public class Day04 {
//    public static void main(String[] args) {
//        //方法名(参数);
//        //方法名(变量名/常量值);
//        //test1(5,6,7)
//        //方法调用时参数的数量和类型必须与方法定义中设置相匹配，否则报错
//    }
//    public static void test1(int a,int b,int c){
//        //数据类型和变量名都不能缺少 多个参数之间用 逗号分割,
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int input = sc.nextInt();
        isEvenNumber(input);
    }
    public static void isEvenNumber(int input){
        System.out.println(input % 2 == 0);
    }
}
