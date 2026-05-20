class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int [] c = new int[n];
        int x =0;
        for(int i=0;i<n;i++){
            c[A[i]-1]++;
            if(c[A[i]-1] == 2) x++;
            c[B[i]-1]++;
            if(c[B[i]-1] == 2) x++;
            ans[i]=x;
        }
        return ans;
    }
}


// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         int n = A.length;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int[] c = new int[n];
//         for(int i=0;i<n;i++){
//             map.put(A[i],map.getOrDefault(A[i], 0)+1);
//             int a = i+1;
//             for(int j=0;j<i+1;j++){
//                 if(!map.containsKey(B[j])){
//                     a--;
//                 }
//             }
//             c[i]= a;
//         }
//         return c;
//     }
// }

