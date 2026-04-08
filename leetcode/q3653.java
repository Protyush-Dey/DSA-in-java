class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1_000_000_007;
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0] ; j<=queries[i][1];j+=queries[i][2]){
                if(j>nums.length-1) break;
                nums[j] = (int)(((long) nums[j] * queries[i][3]) % MOD);
            }
        }
                int xor = 0;
        for (int num : nums) {
            // num ;
            xor ^= num;
        }

        return xor;
    }
}
