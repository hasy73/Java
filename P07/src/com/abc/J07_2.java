package com.abc;

public class J07_2 {
    public static void main(String args[]){
        System.out.println(printDepart('1'));
        System.out.println(printDepart('6'));
        System.out.println(printDepart('3'));
        System.out.println(printDepart('5'));
        System.out.println(printDepart('8'));
        System.out.println(printDepart('2'));
        System.out.println(printDepart('7'));
        System.out.println(printDepart('2'));
    }
    
    
    public static String printDepart(char d){
        String depart="未知";
        
        if(d=='1'){
            depart="會統科";      
        }else if(d=='2'){
            depart="財金科";
        }else if(d=='3'){
            depart="財稅科";            
        }else if(d=='4'){
            depart="國貿科";
        }else if(d=='5'){
            depart="企管科";
        }else if(d=='6'){
            depart="資管科";
        }else if(d=='7'){
            depart="應外科";
        }
        return depart;
    }
}
