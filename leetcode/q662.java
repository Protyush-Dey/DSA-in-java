/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair<TreeNode , Integer>> q = new LinkedList<>();
        int max = 0;
        q.add(new Pair<>(root , 0));
        while(!q.isEmpty()){
            int len = q.size();
            int n = q.peek().getValue();
            int m = 0;
            for(int i=0;i<len;i++){
                Pair<TreeNode , Integer> p = q.poll();
                TreeNode t = p.getKey();
                m=p.getValue();
                if(t.left!=null)q.add(new Pair<>(t.left,(2*m)));
                if(t.right!=null)q.add(new Pair<>(t.right,(2*m)+1));
            }
            max = Math.max(max , (m-n+1));
        }
        return max;
    }
}
