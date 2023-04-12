import java.util.Stack;

class Solution {

    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        for (char c : stack) {
            System.out.print(c + " ");
        }
        System.out.println();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result.toString());
        return result.reverse().toString();
    }

    public static boolean test0() {
        String input = "leet**cod*e";
        final String output = "lecoe";
        return (removeStars(input).equals(output));
    }

    public static boolean test1() {
        String input = "erase*****";
        final String output = "";
        return (removeStars(input).equals(output));
    }

    public static void main(String[] args) {
        test0();
    }
}