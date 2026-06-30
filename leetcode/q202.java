class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int a = n;
            int r = 0;
            while(a>0){
                int t = a%10;
                r += Math.pow(t,2);
                a/=10; 
            }
            n = r;
        }
        return n==1;
    }
}
