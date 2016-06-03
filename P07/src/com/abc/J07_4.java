package com.abc;

public class J07_4 {
   public static void main(String args[]){
        System.out.println(printDepart("10056045"));
        System.out.println(printDepart("10055001"));
        System.out.println(printDepart("10051008"));
        System.out.println(printDepart("9952008"));
        System.out.println(printDepart("9953008"));
    }
    
    
    public static String printDepart(String s){
        String depart="未知";
        char c;
                
        if(s.length()==8){
            c=s.charAt(4);
        }else{
            c=s.charAt(3);
        }
        
        if(c=='1'){
            depart="會統科";      
        }else if(c=='2'){
            depart="財金科";
        }else if(c=='3'){
            depart="財稅科";            
        }else if(c=='4'){
            depart="國貿科";
        }else if(c=='5'){
            depart="企管科";
        }else if(c=='6'){
            depart="資管科";
        }else if(c=='7'){
            depart="應外科";
        }
        return depart;
    }
}
