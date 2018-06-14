public static int singleNumber(int[] A) {
    
    Hashtable<Integer,Integer> numFreq = new Hashtable<Integer,Integer>();
    Integer count = 0;
    
    for (int i : A){
        count = numFreq.containsKey(i) ? numFreq.get(i) : 0;
        numFreq.put(i , count + 1);
    }
    
    return numFreq.contains(1) ? true : 0;
}