class Solution {
    public int minimumDistance(int[] nums) {
        
        if(nums.length<3) return -1;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(i);
        }
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> value = entry.getValue();
            if(value.size()<3) continue;
            int sum = 0;
            for(int j=0;j<=value.size()-3;j++){
                sum = 2*(value.get(j+2) - value.get(j));
                min = Math.min(min,sum);
                sum = 0;
            }
            }
        return min == Integer.MAX_VALUE ? -1 : min;
    
    }
}
