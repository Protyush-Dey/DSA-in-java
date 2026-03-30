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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return ans;
    }
    public int maxSum(TreeNode root){
        if(root == null) return 0;
        int l = maxSum(root.left);
        int r = maxSum(root.right);
        int a = Math.max(0, l);
        int b = Math.max(0, r);

        int sum = root.val + a + b;

        ans = Math.max(ans, sum);

        return root.val + Math.max(a, b);
    }

}
