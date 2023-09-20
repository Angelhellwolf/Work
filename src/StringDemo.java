import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String rightUsername = "HelloWorld";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            // equals可以比较字符串 xxx.equals(xxx1) 可以比较xxx和xxx1是否内容一致

            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if(i-1 == 0) {
                    System.out.println("账户被锁定，请联系管理员");
                }else {
                    System.out.println("登录失败，用户名或密码错误,您还剩下 " + (i - 1) + " 次机会");
                }
                }
        }
    }
}
