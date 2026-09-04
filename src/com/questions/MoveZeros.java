package com.questions;

public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int first = 0;

        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] != 0){
                int temp;
                temp = nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                first++;
            }
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
