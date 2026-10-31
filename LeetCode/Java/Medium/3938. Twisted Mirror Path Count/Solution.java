
class Solution {
    public int uniquePaths(int[][] grid) {

        int MOD = 1_000_000_007;

        int m = grid.length;
        int n = grid[0].length;

        // dp[i][j][0] = ways entering from left (Right direction)
        // dp[i][j][1] = ways entering from top (Down direction)

        int[][][] dp = new int[m + 1][n + 1][2];

        // Starting position
        dp[0][0][0] = 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int right = dp[i][j][0];
                int down = dp[i][j][1];

                if (grid[i][j] == 0) {

                    // Empty cell: can move right or down
                    int total = (right + down) % MOD;

                    dp[i][j + 1][0] =
                        (dp[i][j + 1][0] + total) % MOD;

                    dp[i + 1][j][1] =
                        (dp[i + 1][j][1] + total) % MOD;

                } else {

                    // Mirror cell

                    // Entered from left -> reflected downward
                    dp[i + 1][j][1] =
                        (dp[i + 1][j][1] + right) % MOD;

                    // Entered from top -> reflected right
                    dp[i][j + 1][0] =
                        (dp[i][j + 1][0] + down) % MOD;
                }
            }
        }

        return (dp[m - 1][n - 1][0]
              + dp[m - 1][n - 1][1]) % MOD;
    }
}
