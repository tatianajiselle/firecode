// o(2^n)
public static long fib(int n) {
    return n <= 1 ? n : fib(n-1) + fib(n-2);
}


(Java Test harness)

    public static void main ( String[] args ) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.print ( fib(i) + ", " );
        }
        System.out.println ( fib(10) );
    }

