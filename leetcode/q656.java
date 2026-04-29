class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs , (a,b) -> a[1]-b[1]);
        for(int i=0;i<pairs.length;i++){
            System.out.print(pairs[i][0]);
            System.out.println(pairs[i][1]);
        }
        int c = 1;
        int l = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(l>=pairs[i][0]) continue;
            c++;
            l=pairs[i][1];
        }
        return c;
    }
}
