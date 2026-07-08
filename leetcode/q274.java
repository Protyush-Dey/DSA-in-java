class Solution {
    public int hIndex(int[] citations) {
        int n =  citations.length;
        Arrays.sort(citations);
        int i = n - 1;
        int c = 0;

        while (i >= 0 && citations[i] > c) {
            c++;
            i--;
        }
        return c;
    }
}
