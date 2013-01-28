package edu.syr.pcpratts.studio.code.jni;

public class JniFirstExample {
 
  //it is good to make pulic wrappers around
  //native methods
  public void printString(String str){
    doPrintString(str);
  }
  
  //the native keyword is present here
  private native void doPrintString(String str);
  
}
