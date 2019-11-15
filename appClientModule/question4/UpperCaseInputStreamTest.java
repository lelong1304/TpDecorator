package question4;

import java.io.*;
import java.net.*;

public class UpperCaseInputStreamTest extends junit.framework.TestCase{

  public void testAccs_README_TXT(){
    try{
      InputStream is = new BufferedInputStream( new FileInputStream(new File("README.TXT")));
	    int c = is.read();
	    assertTrue(" erreur de lecture ???", c!= -1);
	    is.close();
	  }catch(Exception e){
	    fail(" Erreur sur ce fichier : README.TXT ??? " + e.getMessage());
	   }
	}
	
	public void testUpperCase_README_TXT() throws Exception{
    InputStream is = new BufferedInputStream( new FileInputStream(new File("README.TXT")));   // d�claration � d�corer ....
    
	  int c = is.read();
	  while( c != -1){
	    assertTrue("erreur !, '" + Character.valueOf((char)c) + "' ne semble pas �tre une majuscule ...", Character.isUpperCase((char)c) || (char)c==' ');  
	    c = is.read();
	  }

	  is.close();
	}
	
	public void testPushPackUpperCase_README_TXT() throws Exception{ 
	  // � terminer
    fail(" � terminer !!!");
	}
}
