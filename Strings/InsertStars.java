public static String insertPairStar(String s) {
    // Error case
    if (s == null)
      return null;

    // Base case
    else if (s.length() == 1)
      return s;

    // Recursive case for matching
    else if (s.substring(0,1).equals(s.substring(1,2))) {
      return s.substring(0,1) + "*" + insertPairStar(s.substring(1,s.length()));
    }
    
    // Recursive case for non-matching
    return s.substring(0,1) + insertPairStar(s.substring(1,s.length()));
  }

  //========================= overflow solution ============================/
  public static String insertPairStar(String s) {
    // Add your code below this line. Do not modify any other code.
    if(s==null || s.length()<=1) return s;
    return s.charAt(0) + 
            (s.charAt(0)==s.charAt(1) ? "*" : "") +
            insertPairStar(s.substring(1));
    // Add your code above this line. Do not modify any other code.
}