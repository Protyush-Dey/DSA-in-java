import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0)return 0;
        int a = 0;
        boolean ng = false;
        if(s.charAt(0)=='-'){
            ng = true;
            s = s.substring(1);   
        } 
        else if(s.charAt(0)=='+'){
            ng = false;
            s = s.substring(1);   
        } 
        String[] st= s.split("\\D+");
        if (st.length == 0 || st[0].isEmpty()) return 0;
        try{
        BigInteger l =new BigInteger(st[0]);
        System.out.println(l);
        if (l.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0)
                return ng ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        else a = l.intValue();
        System.out.print(a);

        }catch(Exception e){
            return 0;
        }
        return ng ? a*-1 :a;
    }
}
