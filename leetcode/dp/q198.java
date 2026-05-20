import java.util.*;
class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        // dp[0] = nums[0];
        return house(dp , n-1 , nums);
    }
    private int house(int[] dp, int n , int[] nums){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int a = nums[n] + house(dp, n-2 , nums);
        int b = 0 + house(dp, n-1 , nums);
        dp[n] = Math.max(a,b);
        return dp[n];
    }
}
