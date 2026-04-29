import java.util.*;
class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String st = "";
        paren(n,n,st);
        return ans;
    }
    private void paren(int o , int c, String st){
        if(o==0 && c==0){
            ans.add(st);
             return;
        }
        if(o>0){
            paren(o-1 , c, st+'(');
        }
        if(c>o){
            paren(o , c-1, st+')');
        }
    }
}
