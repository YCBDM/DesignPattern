package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/4 10:16
 */
public class SelectSort {

    public static void selectSorted(int[] arr){
        if (arr==null || arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            //最小值在哪个位置上,一开始认为最小值就是第一个值i
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++) {   //从i+1开始到N-1上找最小值的下标
                minIndex = arr[j]<arr[minIndex]?j:minIndex;
                //交换顺序：借助第三个数
            }
            MyCommon.swap1(arr,i,minIndex);
            //MyCommon.swapAnd(arr,i,minIndex);
        }
        MyCommon.printArray(arr);
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,5,6,1,7};
        selectSorted(array);
    }
}
