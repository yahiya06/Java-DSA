package com.binarySearchQuestion;

public class SearchInMountainArray {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
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
