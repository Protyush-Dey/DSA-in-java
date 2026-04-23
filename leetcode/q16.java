class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if(n<3) return 0;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n-2;i++){
            int s = 0;
            int j = i+1;
            int k = n-1;
            while(j<k){
                 s= nums[i] + nums[j] + nums[k];
            if(Math.abs(target-s)<Math.abs(target-ans)) ans = s;
        
                if(s == target) break;
                if(s<target) j++;
                if(s>target) k--;
            }
        }
        return ans;
    }
}
