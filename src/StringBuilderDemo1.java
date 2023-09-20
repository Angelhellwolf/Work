public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();


        //添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);//这个sb只是容器


        //再把StringBuilder变回字符串
        String str = sb.toString();

        System.out.println(str.length());
    }
}
