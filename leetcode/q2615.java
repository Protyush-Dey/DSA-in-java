class Solution {
    public long[] distance(int[] nums) {
        int len =  nums.length;
        HashMap<Integer,long[]> mapl = new HashMap<>();
        HashMap<Integer,long[]> mapr = new HashMap<>();
        long[] arr = new long[len];

        for(int i =0;i<len;i++){
            int a = nums[i];
            if (!mapl.containsKey(a)) {
                mapl.put(a, new long[]{0, 0});
            }
            long[] s = mapl.get(a);
            arr[i] += s[1]*i - s[0];
            s[0]+=i;
            s[1]++;
        }
        for(int i =len-1;i>=0;i--){
            int a = nums[i];
            if (!mapr.containsKey(a)) {
                mapr.put(a, new long[]{0, 0});
            }
            long[] s = mapr.get(a);
            arr[i] += s[0] - s[1]*i;
            s[0]+=i;
            s[1]++;
        }

        return arr;
    }
}
