class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],(map.get(nums[i])+1));
                continue;
            }
            map.put(nums[i],1);
        }
        int len=0;
        for(Map.Entry e : map.entrySet()) {
            nums[len] = (int) e.getKey();
            len++;
        }
        
        return len;
    }
}


/*
Runtime: 11 ms, faster than 6.70% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 41.6 MB, less than 5.96% of Java online submissions for Remove Duplicates from Sorted Array.

Have to improve
Discussions on Leetcode talk about two pointer technique, which should have a significant impact on memory usage and 
will definately decrease the runtime.
*/