// LeetCode 153 Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1 || nums[0] < nums[nums.length - 1]) return nums[0];

        int barrier = nums[nums.length - 1];
        int start = 0, end = nums.length - 1;

        while(start + 1 < end) {
            int mid = (start + end) / 2;

            if(nums[mid] > barrier) start = mid;
            else if(nums[mid] < barrier) end = mid;
        }

        if(nums[start] <= barrier) return nums[start];
        if(nums[end] <= barrier) return nums[end];

        return Integer.MAX_VALUE;
    }
       
}
