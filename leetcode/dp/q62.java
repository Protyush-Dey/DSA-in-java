class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
    // private void path(int s, int e){
    //     if(s==0 && e==0){
    //         c++;
    //         return;
    //     }
    //     if(s<0 || e<0) return;
    //     path(s-1 , e);
    //     path(s , e-1);
    // }
}
