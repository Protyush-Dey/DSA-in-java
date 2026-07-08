import java.util.*;
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int l =  Step(1,cost,dp);
        int r =  Step(0,cost,dp);
        return Math.min(l, r);
    }
    private int Step(int n , int[] cost , int[] dp){
        if(n>=cost.length) return 0;
        if(dp[n]!=-1) return dp[n];
        // if(n==cost.length) return cost[n];
        int l =  Step(n+1, cost, dp);
        int r =  Step(n+2, cost, dp);
        dp[n]=cost[n]+ Math.min(l, r);
        return dp[n];
    }
}
