package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/4 20:13
 */
public class BinarySearchSort {
    //场景1：查找某个数是否存在
    public static boolean isexist(int[] arr,int num){
        if(arr==null || arr.length==0){
            return false;
        }
        int L=0;
        int R=arr.length-1;
        int mid=0;   //中间值
        while (L<R){
            /*
            下面等同于mid=(L+R)/2;但是比后者更安全，
            当L或者R非常大时，相加后容易溢出int类型的范围,改成mid=L+(L-R)/2相对安全；
            换个角度：N/2实际就是N>>1
            用位运算更快更安全！！！
            */
            mid = L+((R-L)>>1);
            if(arr[mid]==num){
                return true;
            }
            else if(arr[mid]>num){
                R=mid-1;
            }
            else{
                L=mid+1;
            }
        }
        return arr[L]==num;
    }


    //2、查找满足>=value的最左位置
    public static int nearstIndex(int[]arr, int value){
        int L=0;
        int R=arr.length-1;
        int index = -1;
        while (L<=R){
            int mid=L+((R-L)>>1);
            //如果中间值大于等于给定值就淘汰右边，将右边界R改为中间值mid的左边一位，并将index置为mid;重新开始查找
            if(arr[mid]>=value){
                index = mid;
                R=mid-1;
            }else {
                L=mid+1;
            }
        }
        return index;
    }

    //无序数组的局部最小值问题：给定无序且任意相邻两个都不相等的数组，要求返回一个局部最小值的位置
    /*
    * 局部最小有三种场景：
    *   1、相邻两个数0位置的数比1位置的数小，那么0位置就是局部最小，因为0左边没数了；
    *   2、如果是N位置的数比N-1位置的数小，那么N就是局部最小，因为N右边没数了；
    *   3、如果是i位置的数比i左右两边的数字都小，那么i就是最小的；
    *
    * 分析上面问题思路：
    *   如果在上面场景1和场景2都没有找到局部最小值的情况下，那么一定在场景3中，就能断定此数组在中间要么有最大值要么最小值；
    *   用二分法来查找是比较理想的！！！
    * */
    public static int getLessIndex(int[] arr){
        if (arr==null||arr.length==0){
            return -1;
        }
        //场景1
        if(arr.length==1||arr[0]<arr[1]){
            return 0;
        }
        //场景2
        if(arr[arr.length-1] < arr[arr.length-2]){
            return arr.length-1;
        }
        //场景3
        int left=1;
        int right=arr.length-2;
        int mid =0;
        while (left<right){
            mid = (left+right)/2;
            //如果中间值大于左边一位，则淘汰调mid的右边，继续从左边开始二分找，将right变为mid左边一位，即mid-1
            if(arr[mid]>arr[mid-1]){
                    right = mid-1;
            }
            //如果中间值大于右边一位，则淘汰调mid的左边，继续从右边开始二分找，将left变为mid右边一位，即mid+1
            else if(arr[mid]>arr[mid+1]){
                    left = mid+1;
            }
            //否则就是既比左边小又比右边小，那就是中间值，直接返回
            else {
                return mid;
            }
        }
        return left;
    }

}
