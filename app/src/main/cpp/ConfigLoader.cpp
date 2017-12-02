#include <string.h>
#include <jni.h>
#include <string>
//#include<iostream>
//using namespace  std;
//#define LOG_TAG "HelloJni"

#include <string.h>
#include <jni.h>
//
// Created by yangfujin on 2017-09-23.
//
extern "C"
JNIEXPORT jstring JNICALL
Java_com_hzu_zao_activities_SplashActivity_getBmobApplication(
        JNIEnv* env,
        jobject /* this */) {
        std::string hello = "1576c66f1680ac9415c969b55063176c";
    /*char s[] = "Hello";
    char *p = s;
    int n = 10;
    int ss =sizeof(s);
    int aa = sizeof(p);
    int nnn = sizeof(n);
    cout<<( "linkToComposerDeath failed (%d)(%d)(%d) ", ss,aa,nnn);*/
    return env->NewStringUTF(hello.c_str());
}