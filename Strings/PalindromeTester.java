public static boolean isStringPalindrome(String str){
    if (str == null){
        return true;
    }
    
    if (str.isEmpty()){
        return true;
    }

    int totalOddCount = 0; // if more than one not palindrome 
    
    HashMap<Character,Integer> characterSet = new HashMap<Character,Integer>();
    Integer count = 0;

    for (char c : str.toCharArray()){ // mark frequencies of characters in that string 
        count = characterSet.containsKey(c) ? characterSet.get(c) : 0;
        characterSet.put(c, count + 1);
    }
    for (char c : str.toCharArray()){
        count = characterSet.containsKey(c) ? characterSet.get(c) : 0;
        
        if (count % 2 == 1){ // if the frequencies is odd number
            totalOddCount += 1;
        }
    }
    
    return totalOddCount <= 1;
}