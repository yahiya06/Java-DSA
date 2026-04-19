package com.binarySearchQuestion;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr ={-1,-3,0,1,12,14,15,24,45,67,89,90,100};
        int target = 24;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if (target<arr[mid]){
                end =mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
