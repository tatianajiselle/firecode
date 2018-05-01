// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
// return as a lexically alphabetic ordered array list

public static ArrayList<String> removeDuplicates(List<String> input) {
    TreeSet<String> words = new TreeSet<>(input);
    
    return new ArrayList<String>(words);
}