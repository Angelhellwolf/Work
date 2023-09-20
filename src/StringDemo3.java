public class StringDemo3 {
    public static void main(String[] args) {
        //获取一个字符串
        String talk ="你妈死了，傻逼LGBTSBCNM";

        //2.定义一个敏感词库
        String[] arr = {"TMD","CNM","SB","LGBT","傻逼"};

        //3.循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"****");
        }

        System.out.println(talk);
    }
}
