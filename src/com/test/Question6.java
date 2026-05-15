package com.test;
//Check whether an array contains duplicate elements.
public class Question6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        if(dup(arr)){
            System.out.println("array contains duplicate elements");
        }
        else {
            System.out.println("array not contains duplicate elements");
        }
    }
    static boolean dup(int[] arr){
        for (int i = 0; i <= arr.length-2;i++){
            for (int j= 1; j<= i; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
