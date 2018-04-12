// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){

    if(str == null) return true;
    HashSet<Character> hs = new HashSet<Character>();
    for(int i = 0; i < str.length(); i++) {
        if(!hs.add(str.charAt(i))) {
            return false;
        }
    }
    return true;
}


//     HashMap<Character,Integer> characterFrequencies = new HashMap<Character,Integer> ();
//     int count = 0;
    
//     if ( str == null || str.isEmpty()){
//         return true;
//     }
    
//     for (char ch : str.toCharArray()){
//         count = characterFrequencies.containsKey(ch) ? characterFrequencies.get(ch) : 0;
//         characterFrequencies.put(ch, count+1);
        
//         if (count+1 > 1){
//             return false;
//         }
//     }
    
//     return true;

// }