package com.timerlink;

import java.util.*;

public class Main1 {
    private int exchange(int num){
        int drunkNum = 0;
        drunkNum = drunkNum + num/3;
        int empNum = drunkNum + num%3;
        while (empNum>2){
            drunkNum = drunkNum + empNum/3;
            empNum = empNum/3 + empNum%3;
        }
        if (empNum==2){
            drunkNum = drunkNum + 1;
        }
        return drunkNum;
    }
    public static void main(String args[]){
        Main1 main = new Main1();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            int a = Integer.valueOf(string);
            int b = main.exchange(a);
            System.out.println(b);
        }

    }
}
