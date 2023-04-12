
//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

import java.util.*;

class Solution {

    final static String test0_result = "/home";
    final static String test1_result = "/";
    final static String test2_result = "/home/foo";
    final static String test3_result = "/c";
    final static String test4_result = "/a/b/c";
    
    public static String simplifyPath(String path) {
        final String dp = "..";
        String[] input = path.split("/",0);
        StringBuilder result = new StringBuilder();
        HashSet<String> skip = new HashSet<>(Arrays.asList("",".",".."));
        Stack<String> stack = new Stack<>();


        for(String s : input) {
            if(s.equals(dp) && !stack.empty()) {
                stack.pop();
            } else if(!skip.contains(s)) {
                stack.push(s);
            }      
      
        }

           Collections.reverse(stack);

        if(stack.empty()) {
            return "/";
        }
        while(!stack.empty()) {
            result.append("/"+stack.pop());
        }
                
                return result.toString();
        }

    

    public static boolean test0() {

        return (simplifyPath("/home/").equals(test0_result));
    }

    public static boolean test1() {

        return (simplifyPath("/../").equals(test1_result));
    }

    public static boolean test2() {

        return (simplifyPath("/home//foo/").equals(test2_result));
    }

    public static boolean test3() {
        return (simplifyPath("/a/./b/../../c/").equals(test3_result));
    }

        public static boolean test4() {
        return (simplifyPath("/a//b////c/d//././/..").equals(test4_result));
    }

    

    public static void main(String[] args) {
        System.out.println(test0());
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
    }
}