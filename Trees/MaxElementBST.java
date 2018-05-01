public int findMax(TreeNode root) {                        
    int max=Integer.MIN_VALUE;
    int rtd=Integer.MIN_VALUE;
    int ld=Integer.MIN_VALU;
    int rd=Integer.MIN_VALUE;
    
    if(root != null) {
        rtd = root.data;
        ld = findMax(root.left);
        rd = findMax(root.right);
        if(ld > rd) {
            max = ld;
        } else {
            max = rd;
        }
        if(rtd > max) {
            max = rtd;
        }
    }
    return max;   
}