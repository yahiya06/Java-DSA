package com.questions;

public class Solution {
    public static void main(String[] args) {
       String s = "listen";
       String t = "silent";
        System.out.println(validAnagram(s,t));

        String n= rev(s);
        System.out.println(n);
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

}
