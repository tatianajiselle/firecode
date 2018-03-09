// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){

    HashMap<Character,Integer> characterFrequencies = new HashMap<Character,Integer> ();
    int count = 0;
    
    if ( str == null || str.isEmpty()){
        return true;
    }
    
    for (char ch : str.toCharArray()){
        count = characterFrequencies.containsKey(ch) ? characterFrequencies.get(ch) : 0;
        characterFrequencies.put(ch, count+1);
        
        if (count+1 > 1){
            return false;
        }
    }
    
    return true;

}