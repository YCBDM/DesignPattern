package com.ycb.suanfa.mst;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/8/5 14:50
 *
 * 问题：已知公鸡5元1只，母鸡3元1只，小鸡1元3只，如何用100元钱买100只鸡？
 * 思路：假设买到的公鸡、母鸡、小鸡只数分别为x,y,z只，那么x+y+z=100;并且5*x+3*y+z/3==100;小鸡指数为整数，z%3==0;
 * 因为x最大值为100/5=20;同理y<34;z<300,如果满足上面条件，
 */
public class Xyz {
    public static void main(String[] args){
        for(int x=1;x<20;x++){
            for(int y=1;y<34;y++){
                for(int z=1;z<300;z++){
                    if((x+y+z)==100 && (5*x+3*y+z/3)==100 && z%3==0) {
                        System.out.print("\t买到的公鸡: "+x +"\t母鸡: "+y +"\t小鸡: "  +z);
                    }
                }
            }
        }

    }
}
