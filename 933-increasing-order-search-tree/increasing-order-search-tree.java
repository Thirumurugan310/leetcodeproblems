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
    TreeNode root1 = null;
    List<Integer> ll = new ArrayList<>();
    int call(TreeNode root){
        if(root==null) return 0;
        call(root.left);
        ll.add(root.val);
        call(root.right);
        return 0;
    }
    public TreeNode increasingBST(TreeNode root) {
        call(root);
        back();
        return root1;
    }
    int back(){
        if(ll.isEmpty())return 0;
        for(int x : ll){
            root1 = call1(root1,x);
        }
        return 0;
    }
    TreeNode call1(TreeNode root1,int x){
        if(root1==null)return new TreeNode(x);
        root1.right = call1(root1.right,x);
        return root1;
    }
}