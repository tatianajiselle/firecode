/* Fix this duplicate collapsing code: public String collapseDuplicates(String a) { int i = 0; String result = ""; while (i < a.length()) { char ch = a.charAt(i); result += ch; while (a.charAt(i+1) == ch) { i++; } i++; } return result; }


collapseDuplicates("a") → "a"
collapseDuplicates("aa") → "a"
collapseDuplicates("abc") → "abc" */

public String collapseDuplicates(String a) {
    int i = 0; String result = "";
   
   if (a.isEmpty()) return a;
   if (a.length() == 1) return a;
   
    while (i < a.length()-1) { 
     if (a.charAt(i) != a.charAt(i+1))
       result += a.charAt(i);
     i++;
    } 
    result += a.charAt(a.length()-1);
    return result; 
 }
 