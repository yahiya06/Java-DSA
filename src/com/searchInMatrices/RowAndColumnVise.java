package com.searchInMatrices;

public class RowAndColumnVise {
    public static void main(String[] args) {

    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;

        while (r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{arr[r][c]};
            }
            if(arr[r][c]<target){
                r++;
            }else{
                c++;
            }
        }
        return new int[]{-1, -1};
    }
}
