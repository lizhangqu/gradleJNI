#include "io_github_lizhangqu_JniBridge.h"

JNIEXPORT jlongArray JNICALL Java_io_github_lizhangqu_JniBridge_nativeCalculateSquares
  (JNIEnv *env, jobject obj, jlongArray values, jint numValues) {
    jlong buffer[numValues];
    env->GetLongArrayRegion(values, 0, numValues, buffer);
    for (int i = 0; i < numValues; i++) {
        buffer[i] = buffer[i] * buffer[i];
    }
    jlongArray result = env->NewLongArray(numValues);
    env->SetLongArrayRegion(result, 0, numValues, buffer);
    return result;
}

JNIEXPORT jint JNICALL Java_io_github_lizhangqu_JniBridge_version
  (JNIEnv *env, jobject obj) {
    return 1;
}