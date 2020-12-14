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
