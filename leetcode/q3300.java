class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int b=37;
        for(int i=0;i<n;i++){
            int a=nums[i];
            int c=0;
            while(a>0){
                c+=a%10;
                a/=10;
            }
            System.out.println(c);
            b = Math.min(c,b);
        }
        return b;
    }
}
