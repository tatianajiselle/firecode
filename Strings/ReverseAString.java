// time complexity = o(n) where n is the length of the string
// space is o(n) == o(1) for constant N in array 

public static String reverseString(String str){
    if (str == null){
        return null;
    }
    
    char[] c = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    
    for (int i =  c.length() -1 ; i > 0; i--){ // **  swap in array **
        sb.append(c[i]);
    }
    
    return sb.toString();
}
