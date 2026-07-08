class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> list = new ArrayList<>();
        int p = 0;
        int x = newInterval[0];
        int y = newInterval[1];
        while(p<n && intervals[p][1]<x){
            list.add(intervals[p]);
            p++;
        }
        int a[] = new int[2];
        if (p == n) {
            list.add(newInterval);
            return list.toArray(new int[list.size()][]);
            }
        a[0] = Math.min(intervals[p][0], x);
         while(p<n && intervals[p][0]<=y ){
            y = Math.max(y, intervals[p][1]);
            p++;
         }
         a[1] = y;
         list.add(a);
         while(p<n){
            list.add(intervals[p]);
            p++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
