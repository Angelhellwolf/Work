package com.angelhell.work7;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建3个商品对象
        Goods g1 = new Goods("001", "小米13Ultra", 5999, 100);
        Goods g2 = new Goods("002", "保温杯", 999, 100);
        Goods g3 = new Goods("003", "枸杞", 99.99, 70);

        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g1;
        arr[2] = g1;
        for (int i = 0; i < arr.length; i++) {
            //i 索引 arr[i] 数组里的元素
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }


}
