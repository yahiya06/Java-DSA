package com.binarySearchQuestion;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={11,2,34,44,56,77,88};
        int target =56;
    }

    static int range(int arr[], int target){
        return 0;

    }

    static int binarysearch(int[] arr, int target, int start, int end){
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
