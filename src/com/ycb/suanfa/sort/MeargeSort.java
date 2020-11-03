package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/10 16:18
 *
 * 归并排序
 * 思路：
 * 1、左边排好序+右边排好序+merge整体有序
 * 2、让其整体有序的过程里用了排外序方法
 * 3、利用master公式来求解时间复杂度
 * 4、也可以利用非递归实现
 *
 * 应用：
 * 需要找出某个数左边比它大或者小的个数问题，都可以用此类方法解决
 *
 */
public class MeargeSort {
    //递归方法实现归并排序
    public static void process(int[]arr,int L,int R){
        if(L==R){
            return;
        }
        int mid = L+((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }


    public static void merge(int[] arr, int L, int Mid, int R) {
        int[] help = new int[R-L+1];   //需要借助辅助数组来装排序后的数据
        int i= 0;                      //辅助数组下标
        int p1 = L;
        int p2 = Mid+1;
        //p1或者p2不越界的情况下，两个数组逐个相互比较，谁小就给help[i]
        while (p1<=Mid && p2<=R){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        //当p1已经跟p2对比完了，但是p1还有剩余的数未对比完
        while (p1<=Mid){
            help[i++] = arr[p1++];
        }
        while (p2<=R){
            help[i++]=arr[p2++];
        }
        for (i = 0; i <help.length ; i++) {
            arr[L+i] = help[i];
        }
    }

}
