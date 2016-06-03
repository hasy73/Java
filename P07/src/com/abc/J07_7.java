package com.abc;

public class J07_7 {
    public static void main(String args[]){
        System.out.println("最大值="+printMax(1,2,3));
    }
    
    public static int printMax(int a, int b, int c){
        int m;
        m=Math.max(Math.max(a, b), c);
        
        return m;
    }
}
