package com.patternQuestion.fastNslow;

//https://leetcode.com/problems/happy-number/

public class Leetcode202 {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while( fast != 1){
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }
    private int findSquare(int number){
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            rem = rem*rem ;
            sum = sum + rem ;
            number = number /10;
        }
        return sum;
    }
}
