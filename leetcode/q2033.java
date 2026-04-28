import java.util.*;
class Solution {
    public int minOperations(int[][] grid, int x) {
      int[] arr = flatGrid(grid); 
      Arrays.sort(arr);
      int n = arr.length;
      int a = arr[n/2];
      int c = 0;
      for(int i=0;i<n;i++){
        int d = Math.abs(arr[i]-a);
        if(d%x!=0) return -1;
        int s = d/x;
        c += s;
      }
      System.out.print(a);
      return c;    
    }
    private int[] flatGrid(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int l = n*m;
        int[] arr = new int[l];
        for(int i=0;i<l;i++){
            arr[i] = grid[i / m][i % m];
        }
        return arr;
    }
}
