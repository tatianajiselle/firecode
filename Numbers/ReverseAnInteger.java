/* 
This still works for negative numbers with an even number of digits. 
Because the initial loop is rev = 0 * 10 + x % 10 (or, rev = x % 10), 
the first non-zero value of rev will be negative. Beyond that, 
additional iterations of x's value will remain negative due to being divided
by a positive number (10), and rev will remain negative due to being
multiplied by a positive number (10). The remaining mod results will
always be negative and added to rev, keeping the value negative.
*/
public static int reverseInt(int x) {
 
    int reverse = 0;
    
    while (x != 0){
        reverse = reverse*10 + x%10;
        x = x/10;
    }
    return reverse;
}