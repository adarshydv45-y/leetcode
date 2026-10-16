class Solution {
    public int sumCounts(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums[j]);

                long count = set.size();
                ans = (ans + count * count) % MOD;
            }
        }

        return (int) ans;
    }
}