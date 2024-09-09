package exercises_leetcode.BinaryTree.Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;




public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;         this.left = left;
         this.right = right;
     }
 }
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper( root, result);
        return result;
    }
    
    private void preorderHelper(TreeNode node, List<Integer> result) {
        //consultar se a raiz é vazia
        if(node != null) {
            result.add(node.val); // visita a raiz;
            preorderHelper(node.left, result);
            preorderHelper(node.right, result);
        }
    }
}