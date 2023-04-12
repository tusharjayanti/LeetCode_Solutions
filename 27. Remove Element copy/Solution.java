//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int element : nums) {
            if (element != val) {
                nums[i] = element;
                i++;
            }
        }

        return i;
    }
}
