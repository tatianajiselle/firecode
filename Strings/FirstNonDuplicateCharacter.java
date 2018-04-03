// runtime is 2N

public static Character firstNonRepeatedCharacter(String str) {
    HashMap<Character,Integer> freq = new HashMap<>();
    int count = 0;
    
    if (str.length == 1){
        return str;
    }
    
    char[] arr = str.toCharArray();
    for (Character ch : arr){
        count = freq.containsKey(ch) ? freq.get(ch) : 0;
        freq.put(ch,count +1);
    }


    for (Character ch : arr){
       count = freq.containsKey(ch) ? freq.get(ch) : 0;
        if (count == 1){
        return ch;
        }
    }
    return null;
}

