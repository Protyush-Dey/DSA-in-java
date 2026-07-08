class Solution {
    static final long MOD = 1_000_000_007L;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int m = s.length();
        int cnt[] = new int[m];
        long add[] = new long[m];
        long arr[] = new long[m];
        long ten[] = new long[m+1];
        ten[0]=1; 
        for(int i=1; i<m; i++){
            ten[i] = (ten[i-1]*10)%MOD;
        }
        cnt[0]= (s.charAt(0) != '0') ?1:0;
        arr[0]= s.charAt(0)-'0';
        add[0]= s.charAt(0)-'0';
        for(int i=1; i<m; i++){
            int a = s.charAt(i)-'0';
            cnt[i]= cnt[i-1]+( a==0?0:1);
            add[i]= add[i-1]+ a;
            if(a!=0)
                arr[i]=(arr[i-1]*10+a)%MOD;
            else
                arr[i]= arr[i-1];
        }
        int n = queries.length;
        int res[] = new int[n];
        for(int i= 0; i<n; i++){
            int l = queries[i][0];
            int r = queries[i][1];

            int st = (l==0)? 0 : cnt[l-1];
            long p = (l==0)? 0 : arr[l-1];
            
            int end = cnt[r];
            int q = end- st;

            if(q==0){
                res[i]= 0;
                continue;
            }
            long x   = (arr[r] - (p * ten[q] % MOD) + MOD) % MOD;
            long sum = add[r] - ((l == 0) ? 0 : add[l - 1]);

            res[i] = (int) ((x * sum) % MOD);
        }
        return res;
    }
}
