import java.util.*;
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] health, String directions) {
        int n = positions.length;
        Integer[] order = new Integer[n];
        for(int i =0;i<n;i++){
            order[i]=i;
        }
        Arrays.sort(order, (a, b) -> Integer.compare(positions[a], positions[b]));
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++){
            int curr = order[i];
            if(directions.charAt(order[i])=='R') st.push(curr);
            else{
                while (!st.isEmpty() && health[curr] > 0){
                int a = st.peek();
                if(health[a]==health[order[i]]){
                    st.pop();
                    health[order[i]]=0;
                    health[a]=0;
                    break;
                }
                else if(health[a]>health[order[i]]){
                    health[a]--;
                    health[order[i]]=0;
                    break;
                }
                else{
                    st.pop();
                    health[order[i]]--;
                    health[a]=0;
                }
                }
                
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (health[i] > 0) {
                result.add(health[i]);
            }
        }

        return result;
    }
}
