package com.abc;

public class J07_1 {
    public static void main(String[] args) {
        System.out.println("部門別:"+ printDepart('A'));
        System.out.println("部門別:"+ printDepart('H'));
        System.out.println("部門別:"+ printDepart('B'));
    }
    
    private static String printDepart(char d){
        String depart="未知";
        
        if(d=='A'){
            depart="會計部";
        }else if(d=='T'){
            depart="運輸部";
        }else if(d=='H'){
            depart="人事部";                   
        }
        return depart;
    }
}
