package Problema1;

import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

class CBTInserter {
    TreeNode root;
    Queue<TreeNode> queue;

    public CBTInserter(TreeNode root) {
        this.root = root;
        queue = new LinkedList<>();
        
        // Realizamos un recorrido por niveles del �rbol binario completo
        // y agregamos los nodos al final de la cola
        Queue<TreeNode> levelOrderQueue = new LinkedList<>();
        levelOrderQueue.offer(root);

        while (!levelOrderQueue.isEmpty()) {
            TreeNode node = levelOrderQueue.poll();

            if (node.left != null) {
                levelOrderQueue.offer(node.left);
            }

            if (node.right != null) {
                levelOrderQueue.offer(node.right);
            }

            // Verificamos si el nodo actual no tiene ambos hijos
            if (node.left == null || node.right == null) {
                queue.offer(node);
            }
        }
    }
    
    public int insert(int val) {
        TreeNode newNode = new TreeNode(val);
        TreeNode parent = queue.peek();
        
        if (parent.left == null) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
            queue.poll(); // Quitamos el padre de la cola si ya tiene ambos hijos
        }
        
        queue.offer(newNode); // Agregamos el nuevo nodo a la cola
        
        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}
