import java.util.*;
class Solution {
    Map<Integer, List<int[]>> map = new HashMap<>();
    int n, m;

    public boolean hasValidPath(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean[][] vi = new boolean[n][m];
        mapFull();
        return path(grid, 0, 0, vi);
    }
    private boolean path(int[][] grid , int c, int r, boolean[][] vi){
        if(c== m-1 && r== n-1) return true;
        vi[r][c] = true;
        for(int[] arr: map.get(grid[r][c])){
            int nc = c + arr[1];
            int nr = r + arr[0];
            if(nc<0 || nr<0 || nr>=n || nc>=m || vi[nr][nc]) continue;
            for(int[] arr1: map.get(grid[nr][nc])){
                int nc1 = nc + arr1[1];
                int nr1 = nr + arr1[0];
                if(nc1==c && nr1==r) {
                    if(path(grid , nc, nr, vi)) return true;
                }
            }
        }
        return false;
    }
    private void mapFull() {
        map.put(1, List.of(new int[]{0, -1}, new int[]{0, 1}));
        map.put(2, List.of(new int[]{-1, 0}, new int[]{1, 0}));
        map.put(3, List.of(new int[]{0, -1}, new int[]{1, 0}));
        map.put(4, List.of(new int[]{0, 1}, new int[]{1, 0}));
        map.put(5, List.of(new int[]{0, -1}, new int[]{-1, 0}));
        map.put(6, List.of(new int[]{0, 1}, new int[]{-1, 0}));
    }
}
