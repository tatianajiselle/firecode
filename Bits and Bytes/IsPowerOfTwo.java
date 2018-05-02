// constant time and space
public static boolean isPowOfTwo(int x) {
    return ((x & x-1) == 0);
}