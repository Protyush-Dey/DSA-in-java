class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        int sum = 0;
        long p = 1;
        while(n>0){
            int a = n%10;
            // System.out.println(a);
            n/=10;
            sum+=a;
             if(a>0) {
                res += a*p;
                p*=10;
                }
        }
        return res*sum;
    }
}
