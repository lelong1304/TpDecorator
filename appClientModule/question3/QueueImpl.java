package question3;

import java.util.*;
import question3.fifo.*;
/*
* @author LE Long 
* @version 26/11/2019
*/
public class QueueImpl implements QueueI {
  // � compl�ter
  private int capacity;
  private FileImpl<Integer> file;
  
  public QueueImpl(int capacity){
    // � compl�ter
	  this.capacity = capacity;
	  file = new FileImpl<Integer>(capacity);
  }
  public void add(int i){
    // � compl�ter
	  this.file.enfiler(i);
  }
  public int capacity(){
    return capacity;
  }
  public int remove(){
	  return this.file.defiler();
  // � compl�ter
         // � compl�ter
  }
  public int element(){
    // � compl�ter
    return this.file.premier();
  }
  public void clear(){
     // � compl�ter
	  this.file.vider();
  }
  public int size(){
    return this.file.taille();  // � compl�ter
  }
  public boolean contains(int i){
	  
     // � compl�ter
	  return this.file.contient(i);
  }
  public Iterator<Integer> iterator(){
	  
    return this.file.iterator();  // � compl�ter
  }
  @Override
public String toString() {
	return "QueueImpl [capacity=" + capacity + ", file=" + file + "]";
}
  public boolean equals(Object o){
    if(!(o instanceof QueueI)) return false;
    QueueImpl q = (QueueImpl)o;
    if(this.capacity()!=q.capacity())return false;
    if(this.size()!=q.size())return false;
    
    return this.file.equals(q.getFile());  // � compl�ter 
  }
  public FileImpl<Integer> getFile() {
	return file;
}
public void setFile(FileImpl<Integer> file) {
	this.file = file;
}
public int hashCode(){
    return this.file.hashCode();  // � compl�ter
  }

  public FileI<Integer> af(){
    FileI<Integer> fifo = Fabrique.creerFile(capacity);
	this.file.forEach(x-> fifo.enfiler(x));
    
    return fifo;
  }
 
  public boolean repOk(){
      return this.file.repOk();
      /* � compl�ter && */ 
     //capacity()>0 && size()<=capacity();
  }
  

}
