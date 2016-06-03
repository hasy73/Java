package com.abc;
import java.util.Arrays;

public class J06_3_1 {
    public static void main(String args[]){
        float f[]={123.7f,123.2f,124.5f,119.3f,131.4f,116.9f,125.0f,
                   124.5f,123.7f,128.4f,122.6f,124.5f,121.2f,122.5f};
        Arrays.sort(f);
        /*for (int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
        int k=Arrays.binarySearch(f,123.2f);
        System.out.println(k);*/
        
        float sum=0;
        for (int i=0;i<f.length;i++){
            sum+=f[i];
        }
        System.out.println("平均身高:"+sum/f.length);
        System.out.println("變異數:"+f[f.length-1]);
        System.out.println("標準差:"+f[0]);
        
        
        
        
        
        /*int a=0,b=0;
        for (int i=0;i<f.length;i++){
            if (f[i]>sum/f.length){
                a+=a;
            }else{
                b+=b;
            }
        }
        System.out.println("高於平均:"+a+"人");
        System.out.println("低於平均:"+b+"人");*/
    }
}
