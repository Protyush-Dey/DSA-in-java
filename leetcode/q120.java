import java.util.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n<=1) return (int) triangle.get(0).get(0);
        List<List<Integer>> dp = new ArrayList<>();
        for(int i=0;i<n;i++){
            dp.add(new ArrayList<Integer>());
        }
        for(int i=0;i<triangle.get(n-1).size();i++){
            dp.get(n-1).add(triangle.get(n-1).get(i));
        }
       for(int i = n-2;i>=0;i--){
            List<Integer> arr = triangle.get(i);
            int m = arr.size();
            for(int j = 0;j<m;j++){
                int a = arr.get(j)+Math.min(dp.get(i+1).get(j),dp.get(i+1).get(j+1));
                dp.get(i).add(a);
            }
        }
        return (int)dp.get(0).get(0);
    }
}
