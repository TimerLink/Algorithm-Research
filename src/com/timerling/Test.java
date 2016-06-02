package com.timerling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private int TestStr(String string){
        int num = 0;
        List<String> stringList = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        int ia = 0;
        int ib = 0;
        for (int i=0;i<string.length();i++){
            String ch = String.valueOf(string.charAt(i));
            stringList.add(ch);
        }
        for (int i=0;i<string.length()-1;i++){
            for (int j=i+1;j<string.length();j++) {
                if (stringList.get(i).equals(stringList.get(j))){
                    stringList1.add(stringList.get(i));
                }
            }
        }
        for (int i=0;i<string.length();i++){
            for (int j = 0;j<stringList1.size();j++) {
                if (stringList.get(i).equals(stringList1.get(j))){
                    stringList2.add(stringList.get(i));
                    break;
                }
            }
        }
        int num1 = stringList.size() - stringList1.size()*2;
        int max = stringList2.size();
        while (ia<max) {
            int nummax = stringList2.size();
            if (stringList2.get(ib).equals(stringList2.get(nummax - 1 - ib))) {
                ib++;
                ia+=2;
            } else {
                stringList2.remove(nummax - 1);
                num++;
                ia++;
            }
        }
        return num+num1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            Test t2 = new Test();
            int num2 = t2.TestStr(string);
            System.out.println(num2);
        }
    }
}
