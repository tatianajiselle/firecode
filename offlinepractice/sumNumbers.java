/*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18 */

public int sumNumbers(String str) {
    boolean b = false;
    String con = null;
    int sum = 0;
    int index = 0;

    for (int i = 0; i <= str.length(); i++) {
        if (i < str.length() && Character.isDigit(str.charAt(i))) {
            if (!b) {
                index = i;
                b = true;
            }
        } else if (b) {
            con = str.substring(index, i);
            b = false;
            sum += Integer.parseInt(con);
        }
    }
    return sum;
}