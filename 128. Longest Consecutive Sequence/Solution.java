//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

// Runtime : O(n)
// Space : O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        Set<Integer> set = new HashSet<Integer>();
        // O(n)
        for (int n : nums) {
            set.add(n);
        }
        int maxLengthOfLongestSeq = 1;
        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int streak = 1;
                while (set.contains(n + 1)) {
                    n++;
                    streak++;
                }
                maxLengthOfLongestSeq = Math.max(maxLengthOfLongestSeq, streak);
            }
        }
        return maxLengthOfLongestSeq;
    }
}
