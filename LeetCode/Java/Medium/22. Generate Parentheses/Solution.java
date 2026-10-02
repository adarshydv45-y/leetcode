import java.util.ArrayList;
import java.util.List;

class Solution {

    private void call(int n, int l, int r, String s, List<String> ans) {
        // Base case
        if (l == n && r == n) {
            ans.add(s);
            return;
        }

        // Add '(' if possible
        if (l < n) {
            call(n, l + 1, r, s + "(", ans);
        }

        // Add ')' only if more '(' are already used
        if (r < l) {
            call(n, l, r + 1, s + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        call(n, 0, 0, "", ans);
        return ans;
    }
}
