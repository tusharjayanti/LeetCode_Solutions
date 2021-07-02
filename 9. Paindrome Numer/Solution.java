//  Author: Tushar Jayanti
//  github: github/tusharjayanti


class Solution {
    public boolean isPalindrome(int x) {
         if(x < 0) return false;
        long reversed = 0;
        int og = x;
        while(x>=1) {
            reversed = (reversed*10)+(x%10);
            x/=10;
        }
        return og == reversed;
    }
}
