package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/4 14:42
 */
public class BubbleSort {
    public static void bubbleSorted(int[]array){
        if(array.length<2 || array==null){
            return ;
        }
        for (int i = 0; i <array.length -1 ; i++) {
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]>array[j+1]){
                   int temp = array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
                }
            }
        }
        MyCommon.printArray(array);
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,5,6,1,7};
        bubbleSorted(array);
    }
}
