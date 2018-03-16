// complexity is o(n)
// space is o(n)

public static String replace(String a, String b) {
    
    String[] arr = a.split(" ");
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < arr.length ; i ++){
        sb.append(arr[i]);
        if (i != arr.length -1){
            sb.append(b);
        }
        
    }
    
    return sb.toString();
}