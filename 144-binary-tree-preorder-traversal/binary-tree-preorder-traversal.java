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
    Stack<Integer> st = new Stack<>();
    int preorder(TreeNode root){
        if(root==null)return 0;
        st.push(root.val);
        preorder(root.left);
        preorder(root.right);
        return 0;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
       preorder(root);
       List<Integer> ll = new ArrayList<>();
       for(int x : st){
        ll.add(x);
       }return ll;
    }
}