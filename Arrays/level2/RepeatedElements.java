/* TreeSet is O(log n), this becomes O(n log n) for the worst 
case anyways, plus O(n) space. Simply sorting the array is generally 
the optimal solution. 
*/

public static String duplicate(int[] numbers){
    
    TreeSet<Integer> result = new TreeSet<Integer>();
    
    // Sort the array
    Arrays.sort(numbers);
    
    //Iterate over the array
    for(int i = 1; i < numbers.length; i++) {
       
        // If previous element is the same as current, its the duplicate element
        if(numbers[i] == numbers[i - 1]) {
            result.add(numbers[i]);
        }
    }

    return result.toString();
  }

  // or

  public static String duplicate(int[] numbers){
    // Add your code below this line. Do not modify any other code.
    Set<Integer> map = new HashSet<>();
    Set<Integer> list = new TreeSet<>();
    for (int num : numbers) {
        if (map.contains(num)) list.add(num);
        else map.add(num);
    }
    
    return list.toString();
}