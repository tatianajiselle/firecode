/* Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {
  
    int len = str.length();
      int mid;
      if(len < 3)
          return false;
      mid = len/2;
      if(len%2 == 0)
      {
          if(str.charAt(mid) == 'y')
              return(str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z');
          if(str.charAt(mid-1) == 'y')
              return(str.charAt(mid-2) == 'x' && str.charAt(mid) == 'z');
          return false;
      }
      // len%2 != 0
      else if(str.charAt(mid) == 'y')
              return(str.charAt(mid-1) == 'x' && str.charAt(mid+1) == 'z');
      return false;
  }
  