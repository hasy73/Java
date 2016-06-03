package com.abc;

public class J06 {
    public static void main(String args[]){
        int i=1000000;
        while(true){
               if(i%123==0&&i%45!=0){
               System.out.println(i);
               break;
               }
               i++;
        }
    }
}
