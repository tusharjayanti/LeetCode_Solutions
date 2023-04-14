//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

import java.util.*;

class Solution {

    // private static final List<List<String>> test0_result = new ArrayList<ArrayList<String>>();
       private static final List<List<String>> test0_result = new ArrayList<List<String>>();


    public List<List<String>> groupAnagrams(String[] strs) {
        return pointsList;
    }

    // O(x)
    public static boolean checkAnagrams(String a, String b) {
        int sum = 0;
        for (char c : a.toCharArray()) {
            sum += c - 'a';
        }
        for (char c : b.toCharArray()) {
            sum -= c - 'a';
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagrams("eat", "ate"));

    }
}