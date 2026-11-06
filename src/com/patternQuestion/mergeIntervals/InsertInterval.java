package com.patternQuestion.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newIntervals = new int[];
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> arr = new ArrayList<>();
        boolean insert = false;
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            if (insert == false && start >= newInterval[0]) {
                arr.add(newInterval);
                insert = true;
            }
            arr.add(intervals[i]);
        }
        if (insert == false) {
            arr.add(newInterval);
        }
        int[][] nums = arr.toArray(new int[arr.size()][]);
        int[][] ans = merge(nums);
        return ans;
    }

    private int[][] merge(int[][] nums) {
        List<int[]> ans = new ArrayList<>();
        int s1 = nums[0][0];
        int e1 = nums[0][1];
        for (int i = 1; i < nums.length; i++) {
            int s2 = nums[i][0];
            int e2 = nums[i][1];
            if (e1 >= s2) {
                e1 = Math.max(e1, e2);
            } else {
                ans.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }
        ans.add(new int[]{s1, e1});
        return ans.toArray(new int[ans.size()][]);

    }
}