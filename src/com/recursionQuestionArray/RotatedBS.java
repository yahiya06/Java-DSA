package com.recursionQuestionArray;

public class RotatedBS {
    public static void main(String[] args) {
        int[] nums ={5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(search(nums,target,0,nums.length-1));
    }

    static int search(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[s] < nums[mid]){
            if (target >= nums[s] && target <= nums[mid]){
                return search(nums,target,s,mid-1);
            }
            else {
                return search(nums, target,mid+1,e);
            }
        }
        if (target>nums[mid]){
            return search(nums,target,mid+1,e);
        }
        return search(nums, target,s,mid-1 );
    }
}
