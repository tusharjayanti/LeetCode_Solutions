//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int length = r - l;
            int breadth = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, (length * breadth));
            while (l < r && height[l] <= breadth) {
                l++;
            }
            while (l < r && height[r] <= breadth) {
                r--;
            }
        }
        return maxArea;
    }
}