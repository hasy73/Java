package com.abc;

public class J06_4 {
    public static void main(String args[]){
        String k="Zaw Min Paing squats in the dirt, his hands deftly cranking a spanner to unscrew the bolts on his motorbike. He works swiftly, efficiently and reasonably enthusiastically for someone who never wanted to be a mechanic.";
        
        k=k.replaceAll("\\,", "");
        k=k.replaceAll("\\.", "");
        String t[]=k.split(" ");        //斷字(詞)::將引號內的東東斷字(取代為enter)
        
        for (int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
        System.out.println("共"+t.length+"個字");
    }
}
