package com.ycb.suanfa.mst;

import java.util.Scanner;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/8/5 11:25
 */
public class Feibonacci {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入斐波那契数列的个数：");
        int Count=scanner.nextInt();
        for (int i=1;i<=Count;i++){
            System.out.print(getNum(i)+"\t");
        }
    }

    public static int getNum(int Num){
        if (Num==1 || Num==2){
            return 1;
        }
        else {
            return getNum(Num-1)+getNum(Num-2);
        }
    }

}
