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

        //System.out.println(largeElement(nums));

        int[] nums6= {1, 2,3,4,5};
        //System.out.println(Arrays.toString(rev(nums6)));

        //System.out.println(isSorted(nums3));

        //System.out.println(sumOfElement(nums6));

        //System.out.println(smallestElement(nums));

        int[] nums5 = {1, 2, 3, 4, 6, 7};
        //System.out.println(Arrays.toString(countEvenAndOdd(nums5)));

        int[] nums7 = {10, 20, 30, 40, 50};
        //System.out.println(average(nums7));

        int [] nums8 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateAnArray(nums8,3)));

    }

    public static boolean validAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];
        int i=0;
        while (i<=s.length()-1){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) -'a']--;
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
           actual = actual + num;
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

    public static int[] rev(int[] nums){
        int first =0;
        int last = nums.length-1;

        while (first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] =temp;

            first++;
            last--;
        }
        return nums;
    }

    public static boolean isSorted(int[] nums){
        int first = 0;
        for (int i = 1; i<=nums.length-1;i++){
            if(nums[i] < nums[first]){
                return false;
            }
            first++;
        }
        return true;
    }

    public static int sumOfElement(int[] nums){
        int sum = nums[0];
        for (int i =1; i<=nums.length-1; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int smallestElement(int[] nums){
        int smallest = nums[0];
        for (int i = 1; i<=nums.length-1;i++){
            if (nums[i] < smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static int[] countEvenAndOdd(int[] nums){
        int even = 0;
        int odd =0;

        for (int i = 0; i<= nums.length-1; i++){
            if (nums[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        return new int[]{even,odd};
    }

    public static double average(int[] nums){
        int sum = nums[0];
        for (int i = 1; i<=nums.length-1; i++){
            sum = sum+ nums[i];
        }
        return (double) sum /nums.length;
    }

    public static int[] rotateAnArray(int[] nums, int k){
        int n = nums.length;

        int start = 0;
        int end = n-k-1;
        while (start<end){
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] =temp;
            swap(nums,start,end);
            start++;
            end--;
        }

        int start1 = n-k;
        int end1 = n-1;
        while (start1<end1){
//            int temp = nums[start1];
//            nums[start1] = nums[end1];
//            nums[end1] =temp;
            swap(nums,start1,end1);
            start1++;
            end1--;
        }

        int start2 =0;
        int end2 = nums.length-1;
        while (start2<end2){
//            int temp = nums[start2];
//            nums[start2] = nums[end2];
//            nums[end2] =temp;
            swap(nums,start2,end2);
            start2++;
            end2--;
        }

        return nums;
    }

    public static void swap(int[] nums, int s , int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
