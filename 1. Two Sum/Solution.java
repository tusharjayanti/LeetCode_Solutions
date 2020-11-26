class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ind = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            
            int comp = target - nums[i];

            if(map.containsKey(comp))
            {
                ind[0] = i;
                ind[1] = map.get(comp);
                break;
            }
           
                map.put(nums[i],i);
        
       
        }
        
        return ind;       
        
    }
}
