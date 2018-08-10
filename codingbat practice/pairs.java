/* Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
*/

public Map<String, String> pairs(String[] strings) {
    HashMap<String, String> mp = new HashMap<>();
    
    for(String s : strings){
      mp.put(Character.toString((s.charAt(0))),Character.toString(s.charAt(s.length()-1)));  
    }
    return mp;
  }