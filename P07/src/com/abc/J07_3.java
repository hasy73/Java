package com.abc;

public class J07_3 {
    public static void main(String args[]){
        System.out.println(printDepart("10056045"));
        System.out.println(printDepart("10055001"));
        System.out.println(printDepart("10051008"));
    }
    
    
    public static String printDepart(String s){
        String depart="未知";
        
        if(s.charAt(4)=='1'){
            depart="會統科";      
        }else if(s.charAt(4)=='2'){
            depart="財金科";
        }else if(s.charAt(4)=='3'){
            depart="財稅科";            
        }else if(s.charAt(4)=='4'){
            depart="國貿科";
        }else if(s.charAt(4)=='5'){
            depart="企管科";
        }else if(s.charAt(4)=='6'){
            depart="資管科";
        }else if(s.charAt(4)=='7'){
            depart="應外科";
        }
        return depart;
    }
}
