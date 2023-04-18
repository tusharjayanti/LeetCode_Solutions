//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
Memory Usage: 41 MB, less than 54.27% of Java online submissions for Running Sum of 1d Array.

*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, w1 = word1.length(), w2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while (i < w1 || j < w2) {
            if (i < w1) {
                sb.append(word1.charAt(i++));
            }
            if (j < w2) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}
