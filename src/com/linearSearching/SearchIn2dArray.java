package com.linearSearching;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr= {
                {14,67,78},
                {69,123,45,89},
                {23,78,54,12}
        };
        int target = 54;

        System.out.println(search(arr,target));
    }
    static int search(int[][] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int ans = arr[row][col];
                if(arr[row][col]==target){
                    return ans;
                }
            }
        }
        return -1;
    }
}
