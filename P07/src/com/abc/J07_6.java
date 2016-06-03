package com.abc;

public class J07_6 {
    public static void main(String args[]){
        System.out.println(printSum(10));
    }
    
    public static int printSum(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }
}
