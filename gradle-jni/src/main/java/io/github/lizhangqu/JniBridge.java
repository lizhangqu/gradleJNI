package io.github.lizhangqu;

public class JniBridge {

    static {
        System.loadLibrary("bridge");
    }

    public static native int version();

    public static native long[] nativeCalculateSquares(long[] values, int numValue);


}