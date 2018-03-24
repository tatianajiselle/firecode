// o(n) + o(n) = N*o(n) = o(n)
public static int fib(int n) {
    if (n <= 1){
        return n;
    } else {
        return fib(n-1) + fib(n-2);
}