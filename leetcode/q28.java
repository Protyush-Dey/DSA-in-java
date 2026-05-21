class Solution {
    public int strStr(String h, String a) {
        int m = h.length();
        int n = a.length();
        int x = 0;
        int l = 0;
        int r = 0;
        while(l<m-n+1){
            if(x == n) return l;                                              
            if(h.charAt(r) == a.charAt(x)){
                x++;
                r++;
            }
            else{
                x=0;
                l++;
                r = l;
            }
        }
        return -1;
    }
}
