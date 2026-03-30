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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if (root == null) return arr;
        boolean reverse = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode m = q.remove();
                a.add(m.val);
                if(m.left !=null) q.add(m.left);
                if(m.right != null)q.add(m.right);

            }
            if(reverse) Collections.reverse(a);
            reverse = !reverse;
            arr.add(a);
        }


        return arr;
    }
}
