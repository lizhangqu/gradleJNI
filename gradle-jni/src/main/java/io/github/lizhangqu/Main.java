package io.github.lizhangqu;

public class Main {
    public static void main(String[] args) {
        int version = JniBridge.version();
        System.out.println("version:" + version);
        long[] a = {1, 2, 3, 4, 5};
        long[] result = JniBridge.nativeCalculateSquares(a, a.length);
        if (result != null) {
            for (long n : result) {
                System.out.println(n);
            }
        }
    }
}
