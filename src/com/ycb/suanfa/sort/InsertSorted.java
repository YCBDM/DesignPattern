package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/4 18:41
 */
public class InsertSorted {
    public static void insertSorted(int[] array){
        if(array ==null||array.length<2){
            return;
        }

        for (int i = 1; i < array.length; i++) {
            //现在来到i位置，判断array[i]与array[i-1]即a[i]前面一个位置大小，首先a[i-1]不能越界；然后逐个往前挪
            for (int j = i-1; j>=0 && array[j]>array[j+1] ; j--) {
                MyCommon.swap1(array,j ,j+1);
            }
        }
        MyCommon.printArray(array);
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,5,6,1,7};
        insertSorted(array);
    }
}
