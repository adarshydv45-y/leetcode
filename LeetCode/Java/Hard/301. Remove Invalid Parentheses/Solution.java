class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        Queue<String> q = new LinkedList<>();

        q.offer(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

                String curr = q.poll();

                // Check whether current string is valid
                if (isValid(curr)) {
                    ans.add(curr);
                    found = true;
                }

                // If valid strings found at this level,
                // don't generate next level.
                if (found) {
                    continue;
                }

                // Remove one character at every position
                for (int i = 0; i < curr.length(); i++) {

                    // We only need to remove parentheses
                    if (curr.charAt(i) != '(' &&
                        curr.charAt(i) != ')') {
                        continue;
                    }

                    String next =
                        curr.substring(0, i) +
                        curr.substring(i + 1);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }

            if (found) {
                break;
            }
        }

        return ans;
    }


    // Check whether parentheses are valid
    private boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }

            else if (ch == ')') {
                count--;

                // More closing brackets than opening
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}