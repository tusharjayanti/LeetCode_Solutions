//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

// Runtime: 2 ms Beats:69.37%
// Memory: 42.3 MB Beats:76.70%

class Solution {

    public static boolean test0() {
        return myAtoi("42") == 42;
    }

    public static boolean test1() {
        return myAtoi("   -42") == -42;
    }

    public static boolean test2() {
        return myAtoi("4193 with words") == 4193;
    }

    public static boolean test3() {
        return myAtoi("Number 4193 wi th  words") == 0;
    }

    public static boolean test4() {
        return myAtoi("-91283472 33 2") == Integer.MIN_VALUE;
    }

    public static boolean test5() {
        return myAtoi("3.1415 9") == 3;
    }

    public static boolean test6() {
        return myAtoi("+-12")==0;
    }

    public static int myAtoi(String s) {

        // Remove leading and trailing whitespaces
        s = s.trim();

        // return 0 if input string is empty
        if (s.length() == 0)
            return 0;

        // Determine i f final result is negative or positve
        int i = 0;
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Read input string till we encounter a non digit character
        int answer = 0;
        for (; i < s.length(); i++) {
            if (!isDigit(s.charAt(i) - '0')) {
                break;
            }
            if (answer > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            answer = answer * 10 + (s.charAt(i) - '0');
        }

        return answer * sign;

    }

    public static boolean isDigit(int c) {
        return (c >= 0 && c <= 9);
    }

    public static void main(String[] args) {
        System.out.println(test0());
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test5());
        System.out.println(test6());
    }
}
