public class StringDemo4 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");
//        添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);


        //反转
        sb.reverse();

        //获取长度
        int len = sb.length();
        System.out.println(len);
        //2.打印
        //因为StringBuilder是java已经写好的类，在底层对StringBuilder进行特殊处理，打印对象不是地址值是属性值
        System.out.println(sb);


    }
}
