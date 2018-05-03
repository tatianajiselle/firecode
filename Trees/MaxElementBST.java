public int findMax(TreeNode root) {
    if (root == null)
        return 0;
    
    return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
}


// ======================
public int findMax(TreeNode root) {
    int max = Integer.MIN_VALUE;
    int rootData = Integer.MIN_VALUE;
    int leftData = Integer.MIN_VALUE;
    int rightData = Integer.MIN_VALUE;
    
    if(root != null){
        rootData = root.data;
        leftData = findMax(root.left);
        rightData = findMax(root.right);
        
        if (leftData > rightData){
            max = leftData;
        } else {
            max = rightData;
        }
    }
    if (rootData > max){
        return rootData;
    }
    return max;  
}

