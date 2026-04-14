import java.util.*;
class Solution {
    Long[][] dp;
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
         Collections.sort(robot);
        Arrays.sort(factory, (a,b)->a[0]-b[0]);
        List<Integer> position = new ArrayList<>();

        for(int i=0;i<factory.length;i++){
            for(int j = 0; j<factory[i][1];j++){
                position.add(factory[i][0]);
            }
        }
        int n = robot.size();
        int m = position.size();
        dp = new Long[n][m];
        return Solve(0,0,robot,position);
    }
    public long Solve(int r, int f , List<Integer> robot ,List<Integer> factory){
        if(r>=robot.size()) return 0;
        if (f == factory.size()) return Long.MAX_VALUE / 4;
        if (dp[r][f] != null) return dp[r][f];
        long pass = Math.abs(robot.get(r) - factory.get(f))+Solve(r+1,f+1,robot,factory);
        long skip = Solve(r,f+1,robot,factory);
        return dp[r][f] = Math.min(pass,skip);
    }
}
