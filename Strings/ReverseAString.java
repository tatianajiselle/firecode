// time complexity = o(n) where n is the length of the string
// space is o(1) for array 

public static String reverseString(String str){
    if (str == null){
        return null;
    }
    
    String inputString = str;
    char[] c = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    
    for (int i =  c.length() -1 ; i > 0; i--){
        sb.append(c[i]);
    }
    
    return sb.toString();
}
