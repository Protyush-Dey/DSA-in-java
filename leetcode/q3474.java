class Solution {
    public String generateString(String str1, String str2) {
      int n = str1.length();
      int m = str2.length();
      int w = (n+m)-1;
      char[] word = new char[w];
      Arrays.fill(word, 'a');
      boolean[] can = new boolean[w];
      Arrays.fill(can, true);
      for(int i = 0;i<n;i++){
        if(str1.charAt(i) == 'T'){
            for(int j=i;j<i+m;j++){
                if(!can[j] && word[j] != str2.charAt(j-i)) return "";
                else{
                    word[j] = str2.charAt(j-i);
                    can[j] = false;
                }
            }
        }
      }
    for(int i = 0;i<n; i++){
        if(str1.charAt(i) == 'F'){
            boolean match = false;
            //int inx = -1;
            for(int j=i ; j<i+m ; j++){
                if(word[j] != str2.charAt(j-i)){
                    match = true;
                }
                if( can[j]){
                    inx=j;
                }
            }
            if(match) continue;
            else if(inx !=-1){
                word[inx] = 'b';
            }
            else return "";
        }
      }


    return new String(word);

    }
}
