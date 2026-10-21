
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if (c < s.charAt(i - 1)) {
                sorted = false;
            }

            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        // Already sorted
        if (sorted) {
            return 0;
        }

        // Cannot sort a reversed string of length 2
        if (n == 2) {
            return -1;
        }

        // Minimum character is at the start,
        // or maximum character is at the end
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        // Check whether min or max is in the middle
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        // Minimum is at the end and maximum at the start
        return 3;
    }
}
