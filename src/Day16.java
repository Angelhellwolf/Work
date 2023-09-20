public class Day16 {
    public static void main(String[] args) {
        //使用直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);


        //使用new的方式获取一个字符串对象
        //空参构造，获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");


        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);


        //传递一个字符数组，根据字符数组的内容再创建一个字符串对象
        //需求，我要修改字符串的内容。 abc --》 Qbc
        //abc --> 字符数组 数组是可以发生变化的
        char[] chs ={'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组，根据字节数组的内容再创建一个字符串对象
        //byte
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
        //应用场景，网络当中传输的数据都是字节星系，一般把字节信息进行转换，转成字符串

    }
}
