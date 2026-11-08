package com.patternQuestion.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/interval-list-intersections/description/

public class IntervalListIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        List<int[]> ans = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            int s1 = firstList[i][0] , e1 = firstList[i][1];
            int s2 = secondList[j][0] , e2 = secondList[j][1];
            if(s1 <= s2){
                if(e1>=s2){
                    int e = Math.min(e1,e2);
                    ans.add(new int[]{s2,e});
                }
            }else{
                if(e2>=s1){
                    int e = Math.min(e1,e2);
                    ans.add(new int[]{s1,e});
                }
            }
            if(e1<=e2) i++;
            else j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
