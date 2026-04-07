public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            printTreeHelper(root, "", true);
        }
    }

    private void printTreeHelper(TreeNode node, String prefix, boolean isLast) {
        if (node == null) {
            return;
        }

        System.out.println(prefix + (isLast ? "└── " : "├── ") + node.getData());

        if (node.getLeftChild() != null || node.getRightChild() != null) {
            if (node.getLeftChild() != null) {
                printTreeHelper(node.getLeftChild(), prefix + (isLast ? "    " : "│   "), false);
            }

            if (node.getRightChild() != null) {
                printTreeHelper(node.getRightChild(), prefix + (isLast ? "    " : "│   "), true);
            }
        }
    }

}
