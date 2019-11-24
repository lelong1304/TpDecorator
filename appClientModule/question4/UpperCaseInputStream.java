package question4;

import java.io.InputStream;
import java.io.IOException;
import java.io.FilterInputStream;

/**
 * Cette classe "d�core" un fichier (InputSream) par la conversion de tous
 * les caract�res Minuscule en Majuscule
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class UpperCaseInputStream extends FilterInputStream  {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	} 
	public int read() throws IOException{
        int c = super.read();
        if(c != -1){
            return Character.toUpperCase((char) c);
        } else {
            return c;
        }
    }
	
//	public int read(byte[] b, int off, int len) throws IOException{
//        int c = super.read(b, off,len);
//        for(int i = off; i<off+c; i++){
//            b[i] = (byte)Character.toUpperCase((char)b[i]);
//
//        }
//        return c;
//    }



}