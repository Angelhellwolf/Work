public class Day06 {
    public static void main(String[] args) {
        //1:方法名(参数)


        //数据类型 变量名 = 方法名(参数)
        boolean flag = isEvenNumber(50);
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
