package com.ycb.suanfa.sort;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/6 21:28
 *
 *
 * 异或运算的应用
 */
public class ExclusiveOR {
    //1、不用第三个数交换两个数的值
    public static void exclusiveOrSwap(int i ,int j){
        i = i^j;
        j = i^j;
        i = i^j;
        System.out.print("after swap..."+i+"\n");
        System.out.print("after swap..."+j);
    }

    //2、一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
    public static void printOddTimesNum1(int[] arr){
            int eor=0;
            for(int i =0;i<arr.length;i++){
                eor^=arr[i];
            }
            System.out.print(eor);
    }

    //3、怎么把一个int类型的数，提取出最右侧的1来
    /**
    * 思路：N取反之后再加1，会把原来N中最右侧的1保留下来，其他位都相反，
    * 再与原来的N异或后，最右侧的1仍然为1，其他位都变为0
    * */
    public static int not(int a){
        return a&(~a+1);
    }

    //4、一个数组中，有两种数出现了奇数次，其他数出现了偶数次，怎么找到这两种数？
    /**
    *思路：出现偶数次的数字，相互异或运算之后必然为0，最后只剩下a^b,且a!=b;
    *最后 eor!= 0; eor的二进制值必然有一位上不为0，说明eor在某一位上有1，那就利用方法3提取出最右侧的1出来
     *假设数字是00010010
     *那么提取出最右侧的1之后就是：
     *rightOne:00000010
     *再将这个数与arr里面每个数做与运算，如果不等于0，
    * */
    public static void printOddTimesNum2(int[] arr){
        int eor = 0;
        for (int i = 0; i <arr.length ; i++) {
            eor^=arr[i];
        }
        int rightOne = eor & (~eor +1);   //找到最右侧的1
        int onlyOne = 0;
        for (int i = 0; i <arr.length ; i++) {
            if((arr[i] & rightOne)!=0){   //代表arr[i]这个数里面的最右侧的1的位置与rightOne位置相同，
                                          // 既然不为0，那就是另一个数了
                onlyOne ^=arr[i];
            }
        }
        System.out.println(onlyOne+""+(eor^onlyOne));

    }


    //5、给定任意一个整型数，返回其2进制中1的个数
    /**
     *思路：利用方法3先找到最右侧1，再与给定的值异或运算，就将最右侧的1给抹掉了
     * */
    public static int bit1Count(int Num){
            int count = 0;
            while (Num!=0){
                int rightOne = Num & ((~Num) + 1);
                count++;
                Num^=rightOne;
            }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,6,6,6,1,1};
        //printOddTimesNum1(arr);
        int a =3;
        printOddTimesNum2(arr);
        System.out.print(bit1Count(a));
    }
}
