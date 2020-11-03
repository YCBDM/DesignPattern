package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/4 14:39
 */
public class MyCommon {

    //交换顺序：借助第三个数
    public static void swap1(int[] arr, int i ,int j ) {
        int tmp =arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //交换顺序：用异或运算；此方法不能用于交换指向同一个地址的两个值，比如数组的同一个值，交换后会变成0
    public static void swapAnd(int i ,int j ) {
        i = i^j;
        j = i^j;
        i = i^j;
        System.out.print(i+"\n");
        System.out.print(j);
    }

    //根据给定长度产生一个随机数组
    public static  int[] createRandomArray(int size) {
        int[] RandomArray = new int[size];
        System.out.print("RandomArray Sorted before-----------------"+"\n");
        for (int i = 0; i <size ; i++) {
            int randomArray =(int) (Math.random()*size);
            RandomArray[i] = randomArray;
            System.out.println(RandomArray[i]+"");
        }
        return RandomArray;
    }

    //产生一个数组长度和大小都随机的数组，用于产生样本
    public static int[] getRandomArray(int maxSize ,int maxValue){
        //math.random()   产生[0,1）
        //math.random()*N   [0,N)
        //math.random()*N   [0,N)
        //(int)math.random()*N   [0,N-1]
        int[]arr = new int[(int)((maxSize+1)*Math.random())];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)((maxValue+1)*Math.random()) - (int)((maxValue*Math.random()));
        }
        return arr;
    }

    //for test
    public static int[] copyArray(int[] arr){
        if(arr ==null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            res[i]=arr[i];
        }
        return res;
    }
    //打印数组
    public static void printArray(int[]arr){
        if(arr==null)
            return;
        System.out.print("RandomArray Sorted after-----------------"+"\n");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    //判断两个数组是否相等
    public static boolean isEqual(int[] arr1,int[] arr2){
        if((arr1==null && arr2!=null)||(arr1!=null && arr2==null))
            return false;
        if(arr1==null&&arr2==null)
            return true;
        if(arr1.length!=arr2.length)
            return false;
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[1]!=arr2[i])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
//           int[] arr = createRandomArray(5);
//           int[] arr = getRandomArray(10,10);
//           printArray(arr);
        int a = 1000;
        int b = -6;
        swapAnd(a,b);



    }
}
