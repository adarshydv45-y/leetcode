class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;    // just add 1 and return
                return digits;
            }
            digits[i] = 0;  // carry to next digit
        }
        
        // if all digits were 9 (like 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
        
    }
}