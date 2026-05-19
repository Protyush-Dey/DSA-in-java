class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = 0;
        int n2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while(n1<len1 && n2<len2){
            if(nums1[n1] == nums2[n2]) return nums1[n1];
            else if(nums1[n1] > nums2[n2]) n2++;
            else n1++;
        }
        return -1;
    }
}
