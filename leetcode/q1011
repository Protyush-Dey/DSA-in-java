class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        for(int i=0 ; i<weights.length ; i++){
            h = h + weights[i];
            l = Math.max(l , weights[i]);
        }
        int m = l;
        int s = h;
        int w = m;
        while(m <= s){
            int mid = (m+s)/2;
            if(dayNeed(weights , mid ,days)){
                w = mid;
                s = mid-1;
            }
            else{
                m = mid + 1;
            }

        }
        return w;
    }
    public boolean dayNeed( int[] arr, int max , int days){
        int d = 1;
        int w = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(w + arr[i] > max){
            d++;
            w = arr[i];
        } else {
            w += arr[i];
        }
        }
        return (d<=days);
    }
}
