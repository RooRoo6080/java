package leetcode.easy;

public class SymmetricTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public boolean isSymmetric(TreeNode root) {
        return subtreeMirror(root, root);
    }

    public boolean subtreeMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && subtreeMirror(t1.right, t2.left) && subtreeMirror(t1.left, t2.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(root));
    }
}
