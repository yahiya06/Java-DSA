package com.string;

//StringBuilder
public class SB {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("yahiya"); //create only one object and make changr on it
        name.append(" khan");
        System.out.println(name);

        StringBuilder num = new StringBuilder(" ");
        for (int i =0; i<100; i++){
            num.append(i);
        }
        System.out.println(num);

        StringBuilder AtoZ = new StringBuilder(" ");
        for (int i = 0; i<26; i++){
            char ch = (char)('a'+i);
            AtoZ.append(ch);
        }
        System.out.println(AtoZ);
    }
}
