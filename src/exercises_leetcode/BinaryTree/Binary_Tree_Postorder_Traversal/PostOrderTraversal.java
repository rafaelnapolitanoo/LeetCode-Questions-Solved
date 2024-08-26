

// criando a classe treenode

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}

}



public class PostOrderTraversal {
    public  List<Integer> postorderTransversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);

        return result;
    };

    // metodo para resolver o problema
    private void postorderHelper(TreeNode node, List<Integer> result){
        //verificar se a raiz nao é vazia
        if(node != null){
            postorderHelper(node.left , result);
            postorderHelper(node.right, result);
            result.add(node.val);
        } 
    }
    public static void main(String[] args) {
        //uso
        TreeNode root = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left = new TreeNode(34);

        PostOrderTraversal sol = new PostOrderTraversal();
        List<Integer> result = sol.postorderTransversal(root);

        System.out.println(result);

    }
}
