class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean[] v = new boolean[n];
        // boolean[] dp = new boolean[n];
        return step(start, arr, v, new Boolean[n+1]);
    }
    private boolean step(int i, int[] arr, boolean[] v , Boolean[] dp ){
        if(i>arr.length-1 || i<0  || v[i] )  return false;
        if(arr[i]==0) {
            return true;
        }

        if(dp[i]!=null) return dp[i];
        v[i] = true;

        boolean l =false;
        boolean r = false;
        l = step(i+arr[i], arr,  v, dp);
        r = step(i-arr[i], arr,  v, dp);

        return dp[i] = l||r;
    }
}
