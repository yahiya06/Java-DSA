package com.patternQuestion.mergeIntervals;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/attend-all-meetings-ii/1


public class MeetingRoom2 {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        Arrays.sort(start);
        Arrays.sort(end);
        int room = 0, res = 0, i = 0, j = 0;
        while(i<n && j<n){
            if(start[i]<end[j]){
                room++;
                res = Math.max(room, res);
                i++;
            }else{
                room--;
                j++;
            }
        }
        return res;
    }
}
