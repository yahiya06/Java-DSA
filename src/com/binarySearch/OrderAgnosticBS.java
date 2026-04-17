package com.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // array is in ascending order
        //int[] arr ={-1,-2,0,1,2,4,5,56,78,90,100};

        //array is in descending order
        int[] arr ={100,90,78,56,5,4,2,1,0,-2,-1};
        int target = 78;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if (arr[start]<arr[end]){ // statement check the array is in ascending or descending order
            while(start<=end){ // if the statement is true then array is in ascending order
                int mid = start + (end - start)/2;
                if(target<arr[mid]){
                    end = mid -1;
                } else if (target>arr[mid]) {
                    start = mid +1;
                }else{
                    return mid ;
                }
            }
            return -1;
        }else { // else array is in descending order
            while (start<=end){
                int mid = start + (end - start)/ 2;
                if(target<arr[mid]){
                    start = mid +1;
                } else if (target>arr[mid]) {
                    end = mid -1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
