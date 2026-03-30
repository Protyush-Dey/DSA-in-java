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
    List<Integer> arr = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightView(root , 0);
        return arr;
    }
    public void rightView(TreeNode root , int d){
        if(root == null) return;
        if(d == arr.size()) arr.add(root.val);
        rightView(root.right , d+1);
        rightView(root.left , d+1);

    }
}
