package question4;

import java.io.*;
import java.net.*;

public class UpperCaseInputStreamTest extends junit.framework.TestCase{
	private String nameFile = "README.TXT";

  public void testAccs_README_TXT(){
    try{
      InputStream is = new BufferedInputStream( new FileInputStream(new File(nameFile)));
	    int c = is.read();
	    assertTrue(" erreur de lecture ???", c!= -1);
	    is.close();
	  }catch(Exception e){
	    fail(" Erreur sur ce fichier : README.TXT ??? " + e.getMessage());
	   }
	}
	
	public void testUpperCase_README_TXT() throws Exception{
    InputStream is = new UpperCaseInputStream( new FileInputStream(new File(nameFile)));   // d�claration � d�corer ....
    
	  int c = is.read();
	  while( c != -1){
	    assertTrue("erreur !, '" + Character.valueOf((char)c) + "' ne semble pas tre une majuscule ...", Character.isUpperCase((char)c) || (char)c==' ');  
	    c = is.read();
	  }

	  is.close();
	}
	
	public void testPushPackUpperCase_README_TXT() throws Exception{ 
	  // � terminer
    //fail(" � terminer !!!");
		  InputStream is = new UpperCaseInputStream(new FileInputStream(new File(nameFile)));
	        int j = (int) new File(nameFile).length();
	        byte[] b = new byte[(int)j];
	        int off = 0;
	        int len = j;

	        int c = is.read(b, off, len);
	         for(int i = off; i<off+c; i++){
	            b[i] = (byte)Character.toUpperCase((char)b[i]);
	            assertTrue("erreur !, '" + (byte)Character.toUpperCase((char)b[i])
				+"' ne semble pas être une majuscule ...",Character.isUpperCase((char)c) || (char)c==' ');
	            c = is.read(b, off, len);
	        }
	        

	        is.close();
	    
	}
}
