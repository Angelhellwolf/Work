public class Day08 {
    public static void main(String[] args){
        int result = sum(10,20);
        System.out.println(result);
        double doubleResult = sum(10.5,25.5);
        System.out.println(doubleResult);
    }
    //方法重载
    //多个方法在同一个类中
    //多个方法具有相同的方法名
    //多个方法的参数不同，类型不同或数量不同
    //重载仅对应方法的定义，与方法的调用无关，调用方式按照标准格式
    //重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，不能通过返回值来判定两个方法是否构成重载\

    //与返回值无关。在调用的时候，Java虚拟机会通过参数的不同来区分同名的方法

    //方法重载
    public static int sum(int a,int b){
        return a + b;
    }
    public static double sum(double a,double b){
        return a + b;
    }

}
//    public static int sum(int a,int b,int c){
//        return a + b + c;
//    }