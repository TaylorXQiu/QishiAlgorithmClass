// LintCode 461 Kth Smallest Numbers in Unsorted Array.java

public class Solution {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        if (nums == null || nums.length < k || k < 0)
        	return -1;

        return this.quickSelect(nums, k - 1, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int index, int start, int end) {
    	if (start == end) {
    		return nums[start];
    	}

    	int left = start, right = end, mid = start + (end - start) / 2;
    	int pivot = nums[mid];
    	while (left <= right) {
    		while (left <= right && nums[left] < pivot) {
    			left++;
    		}

    		while (left <= right && nums[right] > pivot) {
    			right--;
    		}

    		if (left <= right) {
    			int temp = nums[left];
    			nums[left] = nums[right];
    			nums[right] = temp;
    			left++;
    			right--;
    		}
    	}

    	if (right >= index && start <= right) {
    		return this.quickSelect(nums, index, start, right);
    	}

    	if (left <= index && left <= end) {
    		return this.quickSelect(nums, index, left, end);
    	}

    	return nums[index];
    }
}
