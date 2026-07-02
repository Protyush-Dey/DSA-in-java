class Solution {
    int[][] best;

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();

        best = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(best[i], -1);
        }

        boolean[][] visited = new boolean[n][m];
        return dfs(grid, 0, 0, health, visited);
    }

    boolean dfs(List<List<Integer>> grid, int s1, int s2, int h, boolean[][] dp) {
        int n = grid.size();
        int m = grid.get(0).size();

        if (s1 < 0 || s2 < 0 || s1 >= n || s2 >= m)
            return false;

        h -= grid.get(s1).get(s2);

        if (h < 1)
            return false;

        if (s1 == n - 1 && s2 == m - 1)
            return true;

        if (best[s1][s2] >= h)
            return false;

        best[s1][s2] = h;

        if (dp[s1][s2])
            return false;

        dp[s1][s2] = true;

        boolean ans = dfs(grid, s1 + 1, s2, h, dp)
                || dfs(grid, s1 - 1, s2, h, dp)
                || dfs(grid, s1, s2 + 1, h, dp)
                || dfs(grid, s1, s2 - 1, h, dp);

        dp[s1][s2] = false;

        return ans;
    }
}
