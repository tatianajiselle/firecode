public static int minTreeDepth(TreeNode root) {
    if(root == null) return 0;
    
    int depth = 1;
    
    Queue<TreeNode> curLevel = new LinkedList<>();
    Queue<TreeNode> nextLevel = new LinkedList<>();
    
    curLevel.add(root);
    
    while(!curLevel.isEmpty()){
    
        TreeNode t = curLevel.poll();
    
        if(t.left == null && t.right == null) return depth;
        else {
            if(t.left != null){
                nextLevel.add(t.left);
            }    
            if(t.right != null){
                nextLevel.add(t.right);
            } 
            if(curLevel.isEmpty()){
                depth++;
                curLevel = nextLevel;
                nextLevel = new LinkedList<>();
            }
        }
    }
    return depth;
}