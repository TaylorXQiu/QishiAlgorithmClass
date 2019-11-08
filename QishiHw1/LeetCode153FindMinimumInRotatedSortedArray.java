// LeetCode 153 Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
        	return -1;

        int left = 0, right = nums.length - 1;
        while (left < right) {
        	if (nums[left] < nums[right]) {
        		break;
        	}

        	int mid = left + (right - left) / 2;

        	if (nums[mid] >= nums[left]) {
        		left = mid + 1;
        	} else {
        		right = mid;
        	}

        }

        return nums[left];
    }
}
