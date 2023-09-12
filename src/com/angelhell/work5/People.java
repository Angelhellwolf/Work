package com.angelhell.work5;

import java.util.Scanner;

public class People {
    //n个人围成一圈，从第一个人开始报数，数到m的人出列，再有下一个人重新从1开始报数，数到m的人在出圈，以此类推，直到所有的人都出圈，在输出以此出圈人的编号
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数 n  n<=100");
        int n = sc.nextInt();
        if (n > 100) {
            System.out.println("你输入的数字不合法");
        }
        System.out.println("请输入证书 m m>= 1");
        int m = sc.nextInt();
        int[] arrPeople = new int[n];
        for (int i = 0; i < arrPeople.length; i++) {
            arrPeople[i] = i + 1;
        }
        for (int i = 0; i < arrPeople.length; i++) {
            System.out.println(arrPeople[i]);
        }
        int[][] temp = new int[n][n];
        int[] outTemp = new int[n];
        int a = 0;
        //数组arrPeople 1 2 3 4 5 6 7 8 9 10
//        for (int j = 0; j < arrPeople.length; j++) {
//            if(m == 1){
//                temp[j][a] = arrPeople[j];
//                System.out.print(arrPeople[j] + " ");
//                break;
//            } else{
//                if(j == m){
//                System.out.println("输出结果： ");
//                temp[j][a] = arrPeople[j];
//                System.out.print(arrPeople[j] + " ");
//                break;}
//                System.out.println("非法");
//                break;
//
//            }
//        }
        // 错误示范（XD
        a++;
        //temp[n][n]
        for (int i = 0; i < temp.length; i++) {
            for (int i1 = 0; i1 < temp[i].length; i1++) {
                temp[i][i1] = outTemp[a];
                System.out.print(temp[i][i1] + " ");
            }
        }

    }

}
