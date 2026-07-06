class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];   
            return a[0] - b[0];       
        });
        int n = intervals.length;
        int res = intervals.length;
        int x = intervals[0][1];
        for(int i = 1;i< n;i++){
            int a = intervals[i][1];
            if(a>x) x =a;
            else res--;
        }
        return res;
    }
}
