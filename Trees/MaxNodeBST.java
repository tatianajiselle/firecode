// recursive

public TreeNode findMax(TreeNode root) {
                      
    // we know that a BST means that the bigger data is stored on the right side of the tree
    // this means we dont need to search on the left size of the tree (/2)
    // we want to go down the tree on the right side to its very bottom right element and return that node
    
    if (root == null) return null;
    else if (root.right == null) return root;
    
    return findMax(root.right);
}

// iterative
public TreeNode findMax(TreeNode root) {
     
    if (root == null) return null;
    
    while(root.right != null){
        root=root.right;
    }
    return root;
}