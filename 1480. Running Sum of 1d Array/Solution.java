/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 39 MB, less than 69.93% of Java online submissions for Running Sum of 1d Array.

*/

class Solution {
    public int[] runningSum(int[] nums) {

        int rsum = 0;

        for(int i=0;i<nums.length;i++) {
            rsum += nums[i];
            nums[i] = rsum;
        }

        return nums;

    }
}
