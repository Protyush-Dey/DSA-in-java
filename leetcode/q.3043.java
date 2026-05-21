class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> a1 = new HashSet<>();
        HashSet<Integer> a2 = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            int c = arr1[i];
            while(c>0){
                if(a1.contains(c))break;
                a1.add(c);
                c/=10;
            }
        }
        for(int i = 0;i<arr2.length;i++){
            int c = arr2[i];
            while(c>0){
                if(a2.contains(c))break;
                a2.add(c);
                c/=10;
            }
        }
        int  s =0;
        for(int nums : a1){
            if(a2.contains(nums)){
                System.out.println(nums);
                s =Math.max(s,nums);
            }
        }
        System.out.println(s);
        return s==0?0: Integer.toString(s).length();
    }
}
