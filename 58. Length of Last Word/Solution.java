//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int i = length-1;
        while(i>=0 && s.charAt(i)==' ') {
            i--;
        }
        int result =0;
        while(i>=0 && s.charAt(i)!=' ') {
            result++;
            i--;
        }
        return result;
    }
}