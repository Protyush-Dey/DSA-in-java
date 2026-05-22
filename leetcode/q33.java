class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int x = index(nums);
        if(target>= nums[x] && target<=nums[n-1])return point(x , n-1 , target , nums);
        return point(0, x-1 , target , nums);
    }
    private int index(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    private int point(int l , int r , int t , int[] arr){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==t) return mid;
            else if(arr[mid]>t) r=mid-1;
            else l= mid+1;
        }
        return-1;
    }
}
