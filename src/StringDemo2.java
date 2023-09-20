import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2 统计 ---->计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
            if (c >= 'a' && c <= 'z'){
                //char类型的变量再参与计算的时候会自动类型提升为int 查询ascii码表
                smallCount++;
            } else if (c>= 'A' && c<='Z') {
                bigCount++;
            }else  if(c>='0' && c<='9'){
                numberCount++;
            }else {otherCount++;}
        }
        System.out.println(smallCount);
        System.out.println(bigCount);
        System.out.println(numberCount);
        System.out.println(otherCount);
    }
}
