//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            x *= -1;
            sign = -1;
        }
        int rev = 0;
        while (x >= 1) {

            if ((rev > Integer.MAX_VALUE / 10) ||
                    (rev == Integer.MAX_VALUE / 10 && (x % 10) > 7)) {
                rev = 0;
                break;
            }

            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return rev * sign;
    }
}
