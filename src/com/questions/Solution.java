package com.questions;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
       String s = "listen";
       String t = "silent";
//        System.out.println(validAnagram(s,t));
//
//        String n= rev(s);
//        System.out.println(n);

        int[] nums = {10, 5, 20, 8, 15};
//        System.out.println(secl(nums));

        int[] nums1 = {0, 1, 0, 3, 12};

        //System.out.println(Arrays.toString(moveZeros(nums1)));

        int[] nums2 = {0,1,2,4};
        //System.out.println(missingNo(nums2));

        //System.out.println(isPrime(2));

        int[] nums3 = {1, 3, 4, 2, 2};
        //System.out.println(duplicate(nums3));

        System.out.println(largeElement(nums));

    }

    public static boolean validAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];
        int i=0;
        while (i<=s.length()-1){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i)-'a']--;
            i++;
        }
        for (int n : arr){
            if (n != 0){
                return false;
            }
        }
        return true;
    }

    public static String rev(String s){
        char[] arr = s.toCharArray();

        int f = 0;
        int l = arr.length - 1;

        while (f < l) {
            char temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;

            f++;
            l--;
        }

        return new String(arr);
    }

    public static int secl(int[] nums){
        int first = nums[0];
        int second= 0;
        for (int i =1; i<=nums.length-1; i++){
            if (nums[i] > first){
                second = first;
                first = nums[i];
            }
            if (nums[i] > second && nums[i] < first){
                second=nums[i];
            }
        }
        return second;
    }

    public static int[] moveZeros(int[] num){
        int first = 0;
        //int second = 1;
        for (int second = 1 ; second <= num.length-1 ; second++){
            if (num[second] != 0){
                int temp = num[second];
                num[second] = num[first];
                num[first] = temp;
                first++;
            }
        }
        return num;
    }

    public static int missingNo(int[] nums){
       int n = nums.length;
       int expected = n * (n+1)/2;
       int actual=0;
       for (int num : nums){
           actual = actual +num;
       }
       return expected-actual;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n-1; i++ ){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int duplicate(int[] nums){
        for (int i = 0 ; i<=nums.length-1;i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static int largeElement(int[] nums){
        int l = nums[0];

        for (int i = 1; i<=nums.length-1;i++){
            if (nums[i] > l){
                l = nums[i];
            }
        }
        return l;
    }
}
