package edu.syr.pcpratts.studio.code.jni;

import java.io.File;

public class LoadDll {
  
  public void load(){
    File file = new File("jni_first_example_x64.so.1");
    System.load(file.getAbsolutePath());
  }
}
