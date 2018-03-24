// time complexity = o(n) where n is the length of the string
// space is constant

public static String reverseString(String str){
    
    if (str.isEmpty()){
        return str;
    }else if (str == null){
        return null;
    }
    
    char[] c = str.toCharArray();

    for (int i = 0 ; i < c.length; i++){ // **  swap in array **
        char temp = c[i];
        c[i] = c[c.length - i];
        c[c.length - i] = temp;
     }
    
    //  String output = new String(c);
    //  return output;
    return new String(c);
}
