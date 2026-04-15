class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min = Integer.MAX_VALUE;
        for(int i= 0 ; i<words.length ; i++){
            if(words[i].equals(target)){
                int a = Math.abs(startIndex - i);
                int b = Math.abs(words.length - a);
                min = Math.min(a,Math.min(b,min));
            }
        }
        return min==Integer.MAX_VALUE ? -1:min;
    }
}
