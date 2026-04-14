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

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
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
