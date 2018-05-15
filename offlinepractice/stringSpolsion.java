  StringBuilder sb = new StringBuilder();
  
  for(int i=0;i<str.length()-1;i++){
      sb.append(str.charAt(i));
      for(int j=0; j<i+1;j++){
        sb.append(str.charAt(j));
      }
  }
  sb.append(str.charAt(str.length()-1));
  return sb.toString();
}

//===========
public String stringSplosion(String str) {
  String result = "";
  // On each iteration, add the substring of the chars 0..i
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}