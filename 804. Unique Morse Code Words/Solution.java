class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> Key = new HashMap<>();
        Key.put('a',".-");
        Key.put('b',"-...");
        Key.put('c',"-.-.");
        Key.put('d',"-..");
        Key.put('e',".");
        Key.put('f',"..-.");
        Key.put('g',"--.");
        Key.put('h',"....");
        Key.put('i',"..");
        Key.put('j',".---");
        Key.put('k',"-.-");
        Key.put('l',".-..");
        Key.put('m',"--");
        Key.put('n',"-.");
        Key.put('o',"---");
        Key.put('p',".--.");
        Key.put('q',"--.-");
        Key.put('r',".-.");
        Key.put('s',"...");
        Key.put('t',"-");
        Key.put('u',"..-");
        Key.put('v',"...-");
        Key.put('w',".--");
        Key.put('x',"-..-");
        Key.put('y',"-.--");
        Key.put('z',"--..");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            StringBuilder morse = new StringBuilder("");
            for(int j=0;j<word.length();j++) {
                morse.append(Key.get(word.charAt(j)));
            }
            String k = morse.toString();
            if(map.containsKey(k)) {
                map.put(k,(map.get(k)+1));
                morse = new StringBuilder("");
                continue;
            }
            map.put(k,1);
             morse = new StringBuilder("");
        }
      
        
        return map.size();
    }
}
