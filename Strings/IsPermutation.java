
    Hashtable<Character,Integer> ht = new Hashtable<>();
    
    if(str1.length() != str2.length()){
        return false;
    }
    
    int count = 0;
    
    for(Character c: str1.toCharArray()){
        count = ht.containsKey(c) ? ht.get(c) : 0;
        ht.put(c,count+1);
    }

    for(Character c: str2.toCharArray()){
        count = ht.containsKey(c) ? ht.get(c) : 0;
        if(count > 1){
            ht.put(c,count-1);
        }
        if(count == 0){
            return false;
        }
    }
    return true;
    
}