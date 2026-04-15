package com.linearSearching;

public class SearchInString {
    public static void main(String[] args) {
        String name= "yahiya";
        char ch= 'k';
        boolean ans = search(name,ch);
        System.out.println(ans);
    }
    static boolean search(String name, char ch){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (ch==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
