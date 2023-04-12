//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1;i>=0;i--) {
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        final int[] result = new int[len+1];
        result[0]=1;
        return result;
    }
}