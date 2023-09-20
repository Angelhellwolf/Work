import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args){
        //1.键盘录入一个字符串，并进行遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2进行便利
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
