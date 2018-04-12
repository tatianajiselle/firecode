// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean isIntPalindrome(int x) {            

    int num = x;
    int r = 0;
    int reverse = 0;
    
    while (num > 0){
        r = num % 10;
        reverse = (reverse * 10) + r;
        num = (num/10);
    }

    return (reverse == x) ? true : false;
    
}