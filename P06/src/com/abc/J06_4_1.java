package com.abc;

public class J06_4_1 {
    public static void main(String args[]){
        String s[]={"棒球","全壘打","雙殺","大聯盟","職棒","本壘"};
        
        k=k.replaceAll("\\,", "");
        k=k.replaceAll("\\.", "");
        String t[]=k.split(" ");        //斷字(詞)::將引號內的東東斷字(取代為enter)
        
        for (int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
        System.out.println("共"+t.length+"個字");
    }
}
