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

// using stack datastructure

public TreeNode findKthLargest(TreeNode root, int k) {
    // Add your code below this line. Do not modify any other code.                   

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode current = root;
    
    while(!stack.empty() || current != null) {
        if (current != null) {
            stack.push(current);
            current = current.right;
        } else {
            current = stack.pop();
            if (k-- == 1) break;
            current = current.left;
        }
    }
    
    return current;
    // Add your code above this line. Do not modify any other code.
}