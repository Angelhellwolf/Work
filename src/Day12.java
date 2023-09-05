public class Day12 {
    public static void main(String[] args){
        int[] arr = {11,12,13,14,15,16,17,18,19,20,21,22,23,25,27};
        int from = 3;
        int to = 9;
        int[] newArr = copyOfRange(arr,from,to);
        for(int i =0 ; i< newArr.length ; i++){
            System.out.print(newArr[i]);
        }

    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr = new int[to - from];
        int a = 0;
        for(int i = from ;i < to;i++) {
            newArr[a] = arr[i];
            a++;
        }
        return newArr;
    }
}
