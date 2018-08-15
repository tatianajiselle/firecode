public TreeNode findMin(TreeNode root){
    if (root == null) return null;

    while (root.next !=null){
        root = root.left;
    }
    return root;
}

