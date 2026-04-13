class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
                if(nums[i]== target){
                int d = Math.abs(i-start);
                ans = Math.min(ans,d);
            }
            
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
