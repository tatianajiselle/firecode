// salesforce
// linear space + time

public static boolean isIsomorphic(String input1, String input2) {
    if (input1.length() != input2.length()){
        return false;
    } else {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for(int i=0; i < input1.length(); i++){
            Character c1 = input1.charAt(i);
            Integer count1 = hm1.get(c1) == null ? 1 : hm1.get(c1) + 1;
            hm1.put(c1,count1);
        
            Character c2 = input2.charAt(i);
            Integer count2 = hm2.get(c2) == null ? 1 : hm2.get(c2) + 1;
            hm2.put(c2,count2);
            
            if(!hm1.get(c1).equals(hm2.get(c2))) return false;
        }
        return true;
    }
}