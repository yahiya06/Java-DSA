package com.patternQuestion.kadane;

public class MaxSumCircularSubarray {
    public int maxSubarraySumCircular(int[] arr) {
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            // Kadane's to find maximum sum subarray
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);

            // Kadane's to find minimum sum subarray
            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);

            // Sum of all the elements of input array
            totalSum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        // If the minimum subarray is equal to total Sum
        // then we just need to return normalSum
        if (minSum == totalSum)
            return normalSum;

        return Math.max(normalSum, circularSum);

    }
}

//     int totalSum = nums[0];
//     int bestMax = nums[0];
//     int bestMin = nums[0];
//     int maxSum = 0;
//     int minSum = 0;
//     for(int i =1; i<nums.length; i++){
//         maxSum = Math.max(nums[i], maxSum + nums[i]);
//         bestMax = Math.max(maxSum, bestMax);

//         minSum = Math.min(nums[i], minSum + nums[i]);
//         bestMin = Math.min(minSum, bestMin);

//         totalSum += nums[i];
//     }
//     if (bestMax < 0) {
//         return bestMax;
//     }
//     int ans = totalSum - bestMin;
//     return Math.max(ans, bestMax);
//
