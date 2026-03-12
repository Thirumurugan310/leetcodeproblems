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
    List<Integer> ll = new ArrayList<>();
    int call(TreeNode root){
        if(root==null)return 0;
        call(root.left);
        ll.add(root.val);
        call(root.right);
        return 0;
    }
    int c(TreeNode root){
        if(root==null)return 0;
        return 1 + c(root.left) + c(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        int count = c(root);
        call(root);
        return back(count);
    }
    int back(int n){
        int[] arr = new int[n];
        int k = 0;
        for(int x : ll){
            arr[k++] = x;
        }int min = Integer.MAX_VALUE;
        for(int i = 1;i < n;i++){
            if(arr[i]-arr[i-1]<min)min = arr[i]-arr[i-1];
        }
        return min;
    }
}