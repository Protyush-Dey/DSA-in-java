import java.util.*;
class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        int res = Integer.MIN_VALUE;
        for(int i = 0; i<n ; i++){
            res = Math.max(res , findMax(dp , d , arr, i));
        }
        return res;
    }
    private int findMax(int[] dp , int t , int[] arr , int s){
        if(dp[s]!=-1) return dp[s];
        int res  = 1;
        for(int i = 1 ; i<=t ; i++){
            if(s-i<0) break;
            if(arr[s-i] >= arr[s]) break;
            res = Math.max(res ,1+findMax(dp , t , arr, s-i) );
        }
        for(int i = 1 ; i<=t ; i++){
            if(s+i>arr.length-1) break;
            if(arr[s+i] >= arr[s]) break;
            res = Math.max(res ,1+findMax(dp , t , arr, s+i) );
        }
        return dp[s] = res;
    }
}
