package com.binarySearchQuestion;

public class SearchInMountainArray {
    public static void main(String[] args) {

    }

    static int ans(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstry = orderAgnosticBS(arr, target, 0, peak);
        if(firstry != -1){
            return firstry;
        }
        return orderAgnosticBS(arr, target, peak, arr.length-1);
    }
    static int peakIndex(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start= mid +1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean check = arr[start]<arr[end];// statement check the array is in ascending or descending order
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(check) {
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }else {
                if(target<arr[mid]){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
