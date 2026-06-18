class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            switch (c) {
                case '*' -> {
                    if(res.length()>0){
                        res.deleteCharAt(res.length() - 1);
                    }
                }
                case '#' -> res.append(res);
                case '%' -> res.reverse();
                default -> res.append(c);
                }
            }
           return res.toString();
        }
}
