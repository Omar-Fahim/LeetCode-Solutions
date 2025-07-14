
 // Definition for a binary tree node.
  public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
  }
 
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(subRoot == null)
            return true;

        if(root == null)
            return false;

        if(isIdentical(root,subRoot))
            return true;
            
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    

    public boolean isIdentical(TreeNode root_one, TreeNode root_two)

    {
        
        if(root_one == null && root_two == null)
            return true;

        if(root_one == null || root_two == null)
            return false;

        if(root_one.val != root_two.val)
            return false;

        return isIdentical(root_one.left,root_two.left) && isIdentical(root_one.right,root_two.right);

    }
}