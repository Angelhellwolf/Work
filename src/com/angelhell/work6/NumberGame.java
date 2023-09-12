package com.angelhell.work6;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGame {
    //n个人围成一圈，从第一个人开始报数，数到m的人出列，再有下一个人重新从1开始报数，数到m的人在出圈，以此类推，直到所有的人都出圈，在输出以此出圈人的编号
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入当前有多少个人");
        int n = sc.nextInt();
        System.out.println("请输入一个数确定数到多少出列");
        int m = sc.nextInt();
        int[][] arr = game(n, m);
        int[] maxArr = arrayDimensionalityReduction(arr, n);
        for (int i = 0; i < maxArr.length; i++) {
            System.out.println(maxArr[i] + " ");
        }
    }

    public static int[][] game(int n, int m) {
        int[][] outArr = new int[n][n];
        int[][] arr = new int[n][n];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = a;
                a++;
                System.out.print("[" + arr[i][i1] + "]");
            }
            System.out.println(" ");
            a = 1;
        }
        //到谁就把谁从一个数组里面赋值到另一个数组的一个元素然后删除它在本身的数组
//        for (int i = 0; i < outArr.length; i++) {
//            for (int i1 = 0; i1 < outArr[i].length; i1++) {
//                    for (int i5 = 0; i5 < arr.length; i5++) {
//                        for (int j = 0; j < arr[i].length; j++) {
//                            if (arr[i5][j] == m) {
//                                outArr[i5][j] = arr[i5][j];
//                                arr[i5][j] = 0;
//                            }
//                        }
//                    }
//
//            }
//        }
        //还有问题 感冒还没好 明天接着写XD
        //把m-1 索引的数据拿出来 赛进这个二维数组里
        return outArr;
    }


    public static int[] arrayDimensionalityReduction(int[][] arr, int n) {
        int maxArr = arr.length - 1;
        return arr[maxArr];
    }
}
