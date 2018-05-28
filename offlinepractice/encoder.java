/* Write a function that replaces the words in `raw` with the words in `code_words` such that the first occurrence of each word in `raw` is assigned the first unassigned word in `code_words`.


encoder(["a"], ["1", "2", "3", "4"]) → ["1"]
encoder(["a", "b"], ["1", "2", "3", "4"]) → ["1", "2"]
encoder(["a", "b", "a"], ["1", "2", "3", "4"]) → ["1", "2", "1"]
*/

public String[] encoder(String[] raw, String[] code_words) {
    int index = 0;
    HashMap<String,String> hm = new HashMap<>();
    String mapping = "";
    String[] answer = new String[raw.length];
    
    for(String s1 : raw){
      mapping = hm.containsKey(s1) ? hm.get(s1) : code_words[index];
      hm.put(s1,mapping);
      
      answer[index]=mapping;
      index++;
    }
    return answer;
  }