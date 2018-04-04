public static boolean isAnagram(String input1, String input2) {
    if(input1 == null || input2 == null) return false;
    int[] charMap = new int[256];
    int count = 0;
    
    for(char c : input1.toCharArray()) {
        charMap[c]++;
        count++;
    }
    
    for(char c : input2.toCharArray()) {
        if(charMap[c]-- == 0) return false;
        count--;
    }
    
    return count == 0;
}