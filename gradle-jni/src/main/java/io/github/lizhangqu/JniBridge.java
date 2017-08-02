package io.github.lizhangqu;

public class JniBridge {

    static {
        NativeLibrary.load();
    }

    public static native int version();

    public static native long[] nativeCalculateSquares(long[] values, int numValue);


}