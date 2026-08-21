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
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        TreeNode curr = root;
        int sum = 0;
        while(curr != null ){
            if(curr.right == null){
                sum += curr.val;
                curr.val = sum;
                curr = curr.left;
            }
            else{
                TreeNode succ = curr.right;
                while(succ.left != null && succ.left != curr){
                    succ = succ.left;
                }
                if(succ.left == null){
                    succ.left = curr;
                    curr = curr.right;

                }
                else{
                    sum += curr.val;
                    curr.val = sum;
                    succ.left = null;
                    curr = curr.left;
                }
            }
        }
        return root;
        
    }
}