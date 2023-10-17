public class Day18 {
    public static void main(String[] args) {
        final int a= 10;
        System.out.print(a);
        /*
        final修饰方法：
            表示该方法是最终方法，不能重写
        final修饰类：
            表示该类是最终类，不能被继承
        final修饰变量：
            叫做常量，只能被赋值一次
        */



        {
            //局部代码块
            int c = 10;
            System.out.println(c);
        }
    }
}

class Fu{
    public final void show(){
        System.out.println("父类的");
    }
}

//class Zi extends Fu{
//}
