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
    public boolean hasPathSum(TreeNode r, int t) {
        if(r==null)return false;
        if(r.val == t && r.left==null && r.right==null)return true;
        t = t - r.val;
        return hasPathSum(r.left,t) || hasPathSum(r.right,t);
    }
}