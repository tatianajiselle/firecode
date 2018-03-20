// time complexity = o(n) where n is the length of the string
// space is constant

public static String reverseString(String str){
    if (str == null){
        return null;
    }
    
    char[] c = str.toCharArray();

    for (int i = 0 ; i < 0; i++){ // **  swap in array **
        char temp = c[i];
        c[i] = c[c.length - i];
        c[c.length -1] = temp;
     }
    
    return sb.toString();
}
