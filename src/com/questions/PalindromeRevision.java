package com.questions;

public class PalindromeRevision {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int f=0;
        int l=s.length()-1;
        while (f<l){
            while (f<l && !Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }
           while (f<l && !Character.isLetterOrDigit(s.charAt(l))){
               l--;
           }
           if (Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(l))){
               return false;
           }
           f++;
           l--;        }
        return true;
    }
}
