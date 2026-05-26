package com.questions;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s,t));
    }
//    static boolean anagram(String s, String t){
//        if(s.length() != t.length()){
//            return false;
//        }
//        int[] count = new int[26];
//        for (int i =0; i<s.length();i++){
//            for (int j = t.charAt(t.length()) ; j<0;j++){
//                if (s.charAt(i) == t.charAt(j)){
//
//                }
//            }
//        }
//
//    }

    static boolean anagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){

            count[s.charAt(i) - 'a']++;

            count[t.charAt(i) - 'a']--;
        }

        for(int num : count){

            if(num != 0){
                return false;
            }
        }

        return true;
    }
}
