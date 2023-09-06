public class Day14 {
    public static void main(String[] args) {
        //二维数组
    /*
     二维数组静态初始化格式:
                       数据类型[][] 数组名 = new 数据类型[][]{{元素1, 元素2}{元素1, 元素2}}
                简化格式：
                       数据类型[][] 数组名 = {{元素1, 元素2}{元素1, 元素2}};
                元素访问:
                       数据名[索引][索引];
                二维数组遍历:
                       先得到一维数组，在遍历一维数组获取元素
     */
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //记得把每个一维数组，单独携程一行，每一个一维数组其实是二维数组中的元素。 每一个一维数组之间用, 隔开 最后一个不需要,
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        //获取元素
        System.out.println(arr3[0]); //打印内存地址

        //arr3[0]: 二维数组的第一个一维数组
        //arr3[0][0]: 获取第一个一维数组中0索引的元素
        System.out.println(arr3[0][0]);
        //

//        int[] arr4 = arr3[0];
//        for(int i = 0; i < arr4.length;i++){
//            System.out.println(arr4[i]);
//        }

        //二维数组的遍历
        //外循环: 遍历二维数组，得到里面的每一个一维数组
        for(int i = 0; i<arr3.length;i++){
            //i: 表示二维数组中的每一个索引
            //arr3[i]: 表示二维数组中的每一个元素(一堆数组)
            //内循环: 遍历一维数组, 得到里面的每一个元素
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}