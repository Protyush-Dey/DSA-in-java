class Solution {
    int c= 0;
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        // int c = 0;
        for(int i = 1; i<n; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int i = n-1 ; i>=0;i--){
            int a = arr[i] - k;
            if(a==0){
                c++;
                // continue;
            }
            Find(arr , i , a);
        }
        return c;
    }
    public void Find(int[] arr , int i , int a){
        for(int j=0;j<i ; j++){
            if(arr[j] == a) c++;
        }
        return;
    }
}
