class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int cl = colors[0];
        int cr = colors[n-1];
        int ml = 0;
        int mr = 0;
        for(int i=0;i<n;i++){
            int c = colors[i];
            if(cl!=c && i>ml) ml = i; 
            if(cr!=c && n-1-i>mr) mr= n-1-i;
        }
        return Math.max(ml , mr);
    }
}
