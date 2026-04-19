class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res =0;
        int l= 0;
        int r = 0;
        while (l<nums1.length && r<nums2.length){
            if(nums1[l]<=nums2[r]){ 
                res = Math.max(res,r-l);
                r++;
                }
            else l++;
        }
        return res;
    }
}
