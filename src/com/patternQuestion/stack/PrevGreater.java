package com.patternQuestion.stack;
import java.util.ArrayList;
import java.util.Stack;

//https://www.geeksforgeeks.org/problems/previous-greater-element/1

public class PrevGreater {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(preGreaterEle(arr));
    }
    public static ArrayList<Integer> preGreaterEle(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        ans.add(-1);
        for(int i = 1; i<n; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
