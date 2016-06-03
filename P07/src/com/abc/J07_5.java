package com.abc;

public class J07_5 {
    public static void main(String args[]){
        System.out.println(printInt(1));
        System.out.println(printInt(2));
    }
    
    public static String printInt(int a){
        String s="奇數";
        
        if(a%2==0)
            s="偶數";
        return s;
    }
}

