public TreeNode findKthLargest(TreeNode root, int k) {                   
    if(root == null) return null;
    int rightSize=0;
    if(root.right != null) {
        rightSize=size(root.right);
    }
    if(rightSize+1 == k) {
        return root;      
    } else if(k <= rightSize) {
        return findKthLargest(root.right, k);
    } else { 
        return findKthLargest(root.left, k-rightSize-1);
    }
}