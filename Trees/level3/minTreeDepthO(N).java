// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int minTreeDepth(TreeNode root) {
    
    if (root == null) return 0;
    
    int depthL = 1; 
    int depthR = 1;
    
    while (root.right != null && root.left != null){
        if (root.right != null){
            root = root.right;
            depthR++;
        } else if (root.left != null){
            root = root.left;
            depthL++;
        }
    }
    
    return Math.max(depthR,depthL);
}