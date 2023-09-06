import java.util.Random;

public class Day13 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //a ----- 97
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字符
                //A ----- 65
                chs[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串类型的变量
        String result = "";
        //随机
        Random random = new Random();
        random.nextInt(chs.length);
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(chs.length);
            //利用随机索引获取元素
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }
        result = result + random.nextInt(10);
        System.out.println(result);
    }
}