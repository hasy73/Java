package com.abc;

import java.util.Arrays;

public class J07_8 {
    public static void main(String args[]){
        System.out.println(printBoolean(55));
    }
    
    public static boolean printBoolean(int a){
        int[] x={1,2,3,4,5,6,7,8,9,10,55,45,80,99,588,496,123,444,523};
        Arrays.sort(x);
        boolean n=false;
        if (Arrays.binarySearch(x, a)>=0){
            n=true;
        }
        return n;
    }
}
