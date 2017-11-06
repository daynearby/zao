#include <string.h>
#include <jni.h>
#include <string>

//
// Created by yangfujin on 2017-09-23.
//
extern "C"
JNIEXPORT jstring JNICALL
Java_com_hzu_zao_activities_SplashActivity_getBmobApplication(
        JNIEnv* env,
        jobject /* this */) {
        std::string hello = "1576c66f1680ac9415c969b55063176c";
            return env->NewStringUTF(hello.c_str());
}