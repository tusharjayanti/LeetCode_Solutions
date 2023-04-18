//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

// Runtime: 15 ms Beats:5.13%
// Memory: 42.6 MB Beats:53.29%

class Solution_1 {

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
        return myAtoi("Number 4193 with words") == 0;
    }

    public static boolean test4() {
        return myAtoi("-91283472332") == Integer.MIN_VALUE;
    }

    public static boolean test5() {
        return myAtoi("3.14159") == 3;
    }

    public static boolean test6() {
        return myAtoi("+-12") == 0;
    }

    public static int myAtoi(String s) {
        s = s.trim();
        int answer = 0;
        int i = 0;
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        for (; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (!isDigit(digit)) {
                break;
            }
            answer = (answer * 10) + digit;
            if (answer == Integer.MAX_VALUE) {
                return (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
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