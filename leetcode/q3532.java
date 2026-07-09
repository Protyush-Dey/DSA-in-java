class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int arr[] = new int[n];
        int m= queries.length;
        boolean res[] = new boolean[m];
        int curr = 0;
        arr[0]= curr;
        for(int i=1; i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff) arr[i]=curr;
            else{
                curr = i;
                arr[i]=curr;
            }
        }
        for(int i=0; i<m;i++){
            if(arr[queries[i][0]]==arr[queries[i][1]]) res[i]=true;
            else res[i]= false;
        }
        return res;
    }
}
