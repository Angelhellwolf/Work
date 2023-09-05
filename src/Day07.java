import java.util.Scanner;

public class Day07 {
    //关闭自动补全
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        int number1 = sc.nextInt();
        System.out.print("请输入第二个数: ");
        int number2 = sc.nextInt();
        boolean flag = isEvenNumber(number1,number2);
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number1,int number2){
        return number1 > number2;
    }
    //void表示无返回值，可以省略return，也可单独写return，后面不加数据
    //public static 返回值类型 方法名(参数){方法体; return 数据;}
    //public static 修饰符
}
