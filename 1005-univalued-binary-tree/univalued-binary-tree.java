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
    boolean call(TreeNode root,int n){
        if(root==null)return true;
        if(root.val!=n)return false;
        return call(root.left,n) && call(root.right,n);
    }

    public boolean isUnivalTree(TreeNode root) {
        int main = root.val;
        return call(root,main);
    }
}