package com.github;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Newsoul on 2016/6/12.
 */
public class StringTo {
    public int strToInt(String string){
        string = string.substring(2);
        String str = Integer.valueOf(string,16).toString();
        return Integer.valueOf(str);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringTo stringTo = new StringTo();
        while (in.hasNext()){
            String s = in.nextLine();
            if (s.length()>2) {
                int a = stringTo.strToInt(s);
                System.out.println(a);
            }
        }
    }
}
