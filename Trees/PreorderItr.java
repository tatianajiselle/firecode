// order a list via preorder, save it to a list and return the list.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    if (root == null){
        return 0;
    }
    stack.push(root);
    
    while(!stack.isEmpty()){
        TreeNode num = stack.pop();
        list.add(num.data);
        
        if(num.right != null){
            stack.push(num.right);
        }
        
        if(num.left != null){
            stack.push(num.left);
        }
    }
    
    return list;
}