import java.util.HashSet;
class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
      HashSet<Character> map = new HashSet<>();
      for(int i =0;i<n;i++){
          map.add(word.charAt(i));
      }
      int r=0;
      for(char c: map){
          if(map.contains((char) (c - 32))) r++;
      }
      return r;
    }
}