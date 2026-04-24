class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for(int i = 0; i<n; i++){
            int l = i;
            int r = i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                r++;
                l--;
            }
            String str = s.substring(l+1,r);

             l = i;
             r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                r++;
                l--;
            }
            String str2 = s.substring(l+1,r);


            if(ans.length()<str.length()) ans = str;
            if(ans.length()<str2.length()) ans = str2;

        }
        return ans;
    }
}
