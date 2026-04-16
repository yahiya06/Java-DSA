package com.linearSearching;

public class Maxwealth {
    public static void main(String[] args) {
        int[][] accounts ={
                {1,2,3},
                {1,4,3},
                {1,2,7}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int row =0; row <accounts.length; row++){
            int sum =0;
            for(int col = 0; col< accounts[row].length ; col++){
                sum += accounts[row][col];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
