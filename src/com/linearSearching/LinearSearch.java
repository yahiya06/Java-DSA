package com.linearSearching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,34,56,78};
        int num=34;
        //print number present on the index
        int ans =search(arr,num);
        System.out.println(ans);

        //print index where number is present
        int ans1 =search1(arr,num);
        System.out.println(ans1);

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==num){
//                System.out.println("Number found at "+arr[i]);
//                return;
//            }
//        }
//        System.out.println("number not found");
    }

    //return index
    static int search1(int arr[],int num){
        if (arr.length==0){
            return -1;
        }

        for (int index=0; index<arr.length;index++){
            int element = arr[index];
            if (element == num){
                return index;
            }
        }
        return -1;
    }


    //return number present on the index
    static int search(int arr[],int num){
        if (arr.length==0){
            return -1;
        }

        for (int index=0; index<arr.length;index++){
            int element = arr[index];
            if (arr[index]==num){
                return element;
            }
        }
        return -1;
        }
}
