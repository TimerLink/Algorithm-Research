package com.timerlink;

import java.util.*;

public class Main {
    public List<Integer> trans(Set<Integer> res){
        Object[] arr = res.toArray();
        List<Integer> as = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            as.add((Integer) arr[i]);
        }
        Collections.sort(as);
        return as;
    }
    public static void main(String args[]){
        Main main = new Main();
        Set<Integer> res = new TreeSet<>();
        Scanner in = new Scanner(System.in);
        int num = 0;
        int count = 0;
        boolean fis = true;
        while (in.hasNext()){
            int a = 0;
            try {
                a = in.nextInt();
            }catch (Exception e){
                System.out.println("请输入正整数");
            }
            if (!fis) {
                res.add(a);
            }
            if (fis){
                count = a;
                fis = false;
            }
            num++;
            if (num>25){
                break;
            }
        }
        List<Integer> as = main.trans(res);
        for (Integer integer:as){
            System.out.println(integer);
        }
    }
}
