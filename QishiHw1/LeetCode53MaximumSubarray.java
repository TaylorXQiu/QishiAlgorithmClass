// LeetCode 53 Maximum Subarray

class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) return 0;

        int minSum = 0, allSum = 0, maxSum = nums[0];
        for(int i = 0; i < nums.length; i++) {
        	allSum += nums[i];
        	maxSum = Math.max(maxSum, allSum - minSum);
        	minSum = Math.min(minSum, allSum);
        }

        return maxSum;
    }
}
