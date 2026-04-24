class Solution {
    public int furthestDistanceFromOrigin(String moves) {
      int n = moves.length();
      int a = 0;
      int b = 0;
      int c = 0;
      for(int i = 0;i<n;i++){
        if(moves.charAt(i) == 'L') a++;
        else if(moves.charAt(i) == 'R') b++;
        else c++;

      }
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

      return a>b ? a+c-b : b+c-a;  
    }
}
