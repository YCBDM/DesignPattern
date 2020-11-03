package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/11 11:10
 *
 * 分组快排
 */
public class QuickSort {
    public static int partition(int[]arr,int L,int R){
        if (L>R){
            return -1;
        }
        if(L==R){
            return L;
        }

        int lessEqual = L-1;
        int index = L;
        while (index < R){
            if(arr[index]<=arr[R]){
                MyCommon.swap1(arr,index,++ lessEqual);
            }
            index++;
        }
        MyCommon.swap1(arr, ++lessEqual,R);
        return lessEqual;
    }

    //荷兰旗帜问题
    public static int[] netherlandsFlag(int[] arr,int L ,int R){
        if(L>R){
            return new int[]{-1,-1};
        }
        if(L==R){
            return new int[]{L,R};
        }
        int less = L-1;
        int more = R;
        int index = L;
        while (index < more){
            if(arr[index] == arr[R]){
                index++;
            }
            else if(arr[index] < arr[R]){
                MyCommon.swap1(arr,index++,++less);
            }else {
                MyCommon.swap1(arr,index,--more);
            }
        }
        MyCommon.swap1(arr,more,R);
        return new int[]{less+1,more};
    }


    public static void process1(int[] arr, int L, int R) {
        if(L>=R){
            return;
        }
        int M = partition(arr,L,R);
        process1(arr,L,M-1);
        process1(arr,M+1,R);
    }

    public static void process2(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        MyCommon.swap1(arr,L + (int)(Math.random()*(R-L+1)),R);
        int[] equalArea = netherlandsFlag(arr,L,R);
        process2(arr, L, equalArea[0] - 1);
        process2(arr, equalArea[1] + 1, R);
    }


    public static void quickSort1(int[]arr) {
        if(arr==null || arr.length<2){
            return;
        }
        process1(arr,0,arr.length-1);
    }
}
