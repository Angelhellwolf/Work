public class Day11 {
    public static void main(String[] args){
        int[] arr = {1,5,6,7,8,9,2564,5};
        int search = 758;
        boolean flag = searchNumber(search,arr);
        System.out.print(flag);
    }
    public static boolean searchNumber(int search, int[] arr){
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == search){
                flag = true;
                break;
            }
        }
        return flag;
    }
    //return 结束方法， break 结束循环

}
