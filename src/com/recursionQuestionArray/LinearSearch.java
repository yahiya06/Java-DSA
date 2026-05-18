package com.recursionQuestionArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,7,34,56,78,23,2};
        int target = 56;
        int ans = ls(arr,target,0);
        System.out.println(ans);
    }
    static int ls(int[] arr, int target,int index){
//        if (target == arr[index]){
//            return index;
//        }

        if(index == arr.length-1){
            return -1;
        }


        return  ls(arr,target,index+1);
    }
}
