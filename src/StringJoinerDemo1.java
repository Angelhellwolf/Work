import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("sb").add("bbb").add("ccc");


        System.out.println(sj);
        Student student = new Student();
    }
    
}
