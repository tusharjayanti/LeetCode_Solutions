//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return false;
        }
        Set<Integer> set = new HashSet<>(n);
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
