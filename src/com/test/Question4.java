package com.test;

//Find the maximum element in an array.
public class Question4 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,7};
        int initial = 0 ;
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i] > initial){
                initial = arr[i];
            }
        }
        System.out.println(initial);
    }
}
