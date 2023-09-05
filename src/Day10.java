public class Day10 {
    public static void main(String[] args){
        int[] arr ={11,22,33,44,55,66};
        int max = maxArr(arr);
        System.out.print(max);

    }
    public static int maxArr(int[] arr){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
 }
