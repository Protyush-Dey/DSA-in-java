class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l = 0;
        int res = 0;
        int arr[] = new int[3];
        for(int r = 0;r<n;r++){
            char c = s.charAt(r);
            arr[c-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                res += n-r;
                arr[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return res;
    }
}
