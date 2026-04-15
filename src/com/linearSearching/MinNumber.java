package com.linearSearching;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr={12, 34,56,78,90,1};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
