package org.wangbiao.algorithm.sort;

import java.util.Arrays;

/**
 * Created by Wang Biao on 15/11/2.
 */
public class Bubble {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 0, 2, 3, 8, 1, 4, 5, 7, 6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    /**
     * 冒泡排序: 比较相邻元素的大小
     *
     * @param arr 需要排序的数组
     * @return 排序后的数组
     */
    public static int[] sort(int[] arr) {
        boolean isSorted = false;
        for (int i = arr.length - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
