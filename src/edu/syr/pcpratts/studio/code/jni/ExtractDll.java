package edu.syr.pcpratts.studio.code.jni;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExtractDll {

  public void extractBinary(String filename) throws IOException {
    String path = "/edu/syr/pcpratts/studio/code/jni/"+filename;
    InputStream is = ExtractDll.class.getResourceAsStream(path);
    OutputStream os = new FileOutputStream(filename);
    while(true){
      byte[] buffer = new byte[32*1024];
      int len = is.read(buffer);
      if(len == -1) { 
        break; 
      }
      os.write(buffer, 0, len);
    }
    os.flush(); 
    os.close(); 
    is.close();
  }
}
