// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public boolean validateBST(TreeNode root) {

    return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
     
public boolean check(TreeNode n, int min, int max){
    if(n==null){
        return true;
    }
    if(n.data <= min || n.data >= max){
        return false;
    }   
    return check(n.left, min, n.data) 
            && check(n.right, n.data, max);
}
