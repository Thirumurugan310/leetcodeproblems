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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        if(root==null)return l;
        String s = "";
        call(root,l,s);
        return l;
    }
    void call(TreeNode r,List<String> l,String s){
        s += r.val;
        if(r.left == null && r.right == null){
            l.add(s);return;
        }
        s+="->";
        if(r.left!=null)
            call(r.left,l,s);
        if(r.right!=null)
            call(r.right,l,s);
    }
}