class Solution {
    public int climbStairs(int n, int[] costs) {

        int a = 0; // dp[i-3]
        int b = 0; // dp[i-2]
        int c = 0; // dp[i-1]

        for (int i = 1; i <= n; i++) {

            int cur = c + costs[i - 1] + 1;

            if (i >= 2) {
                cur = Math.min(
                    cur,
                    b + costs[i - 1] + 4
                );
            }

            if (i >= 3) {
                cur = Math.min(
                    cur,
                    a + costs[i - 1] + 9
                );
            }

            a = b;
            b = c;
            c = cur;
        }

        return c;
    }
}