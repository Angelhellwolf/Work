import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数： ");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数： ");
        int number2 = sc.nextInt();
        bigNumber(number1,number2);
    }
    public static void bigNumber(int number1,int number2){
        if(number2 == number1){
            System.out.println(number2 + "=" + number1);
        }else {
        if(number2 > number1){
            System.out.println(number2 + "<" + number1);
        }else {
            System.out.println( number1 + ">" + number2);
        }
    }
        //大聪明复习法
    }
}
