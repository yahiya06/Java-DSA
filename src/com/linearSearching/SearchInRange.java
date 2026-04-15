package com.linearSearching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,34,5,78,13,46,79,90,100};
        int target =13;
        int ans =search(arr, target,1,5);
        System.out.println(ans);
    }
    static int search(int[]arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }

        for (int index=start; index<=end;index++){
            int element = arr[index];
            if (element== target){
                return element;
            }
        }
        return -1;
    }
}
