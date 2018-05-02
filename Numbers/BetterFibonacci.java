// twitter
// o(1) space and o(n) time
public static int betterFibonacci(int n) {
    int n_2 = 0, n_1 = 1;
    int temp;

    if(n == 0) 
        return n_2;

    else if(n == 1)
        return n_1;

    else {
        for(int i = 2; i <= n; i++){
            temp = n_1 + n_2;
            n_2 = n_1;
            n_1 = temp;
        }
        return n_1;
    }
}