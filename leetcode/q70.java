class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Stair(n,dp);
    }
    private int Stair(int n , int[] dp){
        if(n<=1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = Stair(n-1, dp) +Stair(n-2, dp);
        return dp[n];
    }
}
