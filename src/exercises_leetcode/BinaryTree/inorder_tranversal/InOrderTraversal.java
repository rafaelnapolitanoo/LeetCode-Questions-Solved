package exercises_leetcode.BinaryTree.inorder_tranversal;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class InOrderTraversal {
    // Corrigi o nome do método de InorderTranversal para inorderTraversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;  // Adicionei o ponto-e-vírgula
    }

    // Helper function para a travessia in-order
    private void inOrderHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            inOrderHelper(node.left, result);    // Visitar a subárvore esquerda
            result.add(node.val);                // Adicionar o valor do nó à lista
            inOrderHelper(node.right, result);   // Visitar a subárvore direita
        }
    }
}
