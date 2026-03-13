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
    int tit = 0;
    int call(TreeNode root){
        if(root==null)return 0;
        int left = call(root.left);
        int right = call(root.right);
        tit += Math.abs(left-right);
        return root.val + left + right;
    }
    public int findTilt(TreeNode root) {
        call(root);
        return tit;
    }

}