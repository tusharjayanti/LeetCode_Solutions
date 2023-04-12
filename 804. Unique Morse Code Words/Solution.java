//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.." };

        Set<String> codes = new HashSet<>();
        for (String s : words) {
            StringBuilder code = new StringBuilder();
            for (char c : s.toCharArray()) {
                code.append(morse[c - 'a']);
            }
            codes.add(code.toString());
        }
        return codes.size();
    }
}