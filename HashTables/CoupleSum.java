// Oracle
// linear runtime and space

// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] coupleSum(int[] arr, int goal) {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < arr.length; i++){
       int target = goal-arr[i];
        if(arr[i] < goal){
            if(map.containsKey(target)){
                int[] output = {map.get(target), (i+1)};
                return output;
                }
            else
                map.put(arr[i], i+1);
        }        
    }
    return null;
}