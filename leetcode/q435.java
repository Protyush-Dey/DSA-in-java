class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        if(arr.length<2)return 0;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int left = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<arr[left][1]) ans++;
            else left =i;
        }
    return ans;
    }
}
