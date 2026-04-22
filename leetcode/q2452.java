class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> st = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                if(ChangeAble(queries[i],dictionary[j])){
                 st.add(queries[i]);
                 break;
                }    
            }
        }
        return st;
    }
    private boolean ChangeAble(String a, String b){
        int n = a.length();
        int c = 0;
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)) c++;
        }
        return c<=2;
    }
}
