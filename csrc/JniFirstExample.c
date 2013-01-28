#include "edu_syr_pcpratts_studio_code_jni_JniFirstExample.h"
#include <stdio.h>
#include <stdlib.h>
 
JNIEXPORT void JNICALL Java_edu_syr_pcpratts_studio_code_jni_JniFirstExample_doPrintString
  (JNIEnv * env, jobject this_obj, jstring str)
{
  int len = (*env)->GetStringLength(env, str);
  char * nstr = (char *) malloc(sizeof(char) * len);
  (*env)->GetStringUTFRegion(env, str, 0, len, nstr);
  printf("%s\n", nstr);
  free(nstr);
}
