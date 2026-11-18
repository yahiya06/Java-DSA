package com.patternQuestion.stack;

import java.util.Stack;

public class Leetcode1209 {

    public String removeDuplicates(String s, int k) {

        Stack<int[]> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{ch, 1});
            }

            if (stack.peek()[1] == k) {
                stack.pop();
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int[] pair : stack) {
            for (int i = 0; i < pair[1]; i++) {
                ans.append((char) pair[0]);
            }
        }

        return ans.toString();
    }
}


// class Solution {
//     public String removeDuplicates(String s, int k) {
//         int n = s.length();
//         Stack<int[]> stack = new Stack<>();
//         for(int i =0; i<n; i++){
//             char ch = s.charAt(i);
//             if(stack.isEmpty()){
//                 stack.push(new int[]{ch,1});
//                 continue;
//             }
//             if(stack.peek()[0] != ch){
//                 stack.push(new int[]{ch,1});
//                 continue;
//             }
//             if(stack.peek()[0] == ch){
//                 stack.peek()[1]++;

//             }else{
//                 stack.pop();
//             }
//         }
//         StringBuilder ans = new StringBuilder();

//         for (int[] pair : stack) {
//             for (int i = 0; i < pair[1]; i++) {
//                 ans.append((char) pair[0]);
//             }
//         }

//         return ans.toString();
//     }
// }
