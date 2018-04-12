public static int maxGain(int arr[]){
    int max = arr[1] - arr[0];
    int min = arr[0];
    int i;
    for(i = 1; i < arr.length; i++)
    {       
      if (arr[i] - min > max)                               
        max = arr[i] - min;
      if (arr[i] < min)
           min = arr[i];                     
    }
    return max < 0 ? 0 : max;
  }