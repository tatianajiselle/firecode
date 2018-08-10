// java.util.* has been imported for this problem.
// You don't need any other imports.

public int size(TreeNode root) {
    // Add your code below this line. Do not modify any other code.                          

    if (root == null) return 0;
    return 1 + size(root.left) + size(root.right);

}