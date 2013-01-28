package edu.syr.pcpratts.studio.code.jni;

public class Main {

  public static void main(String[] args){
    LoadDll loader = new LoadDll();
    loader.load();
    
    JniFirstExample first_example = new JniFirstExample();
    first_example.printString("hello world!");
  }
}
