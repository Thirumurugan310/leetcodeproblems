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
    boolean bool = true;
        int isBalancedd(TreeNode root){
            if(root==null)return 0;
            int left = isBalancedd(root.left);
            int right = isBalancedd(root.right);
            if(Math.abs(left-right)>1)bool = false;
            return 1 + Math.max(left,right);
        }
    public boolean isBalanced(TreeNode root) {
        isBalancedd(root);
        return bool;
    }
}