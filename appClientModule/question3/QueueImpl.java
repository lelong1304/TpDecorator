package question3;

import java.util.*;
import question3.fifo.*;


public class QueueImpl implements QueueI {
  // � compl�ter
  private int capacity;
  
  public QueueImpl(int capacity){
    // � compl�ter
	  this.capacity = capacity;
  }
  public void add(int i){
    // � compl�ter
  }
  public int capacity(){
    return capacity;
  }
  public int remove(){
  // � compl�ter
    return 0;     // � compl�ter
  }
  public int element(){
    // � compl�ter
    return 0;
  }
  public void clear(){
     // � compl�ter
  }
  public int size(){
    return 0;  // � compl�ter
  }
  public boolean contains(int i){
    return false;  // � compl�ter
  }
  public Iterator<Integer> iterator(){
    return null;  // � compl�ter
  }
  public String toString(){
    return "� compl�ter";
  }
  public boolean equals(Object o){
    if(!(o instanceof QueueI)) return false;
    QueueImpl q = (QueueImpl)o;
    if(this.capacity()!=q.capacity())return false;
    if(this.size()!=q.size())return false;
    return false;  // � compl�ter 
  }
  public int hashCode(){
    return 0;  // � compl�ter
  }

  public FileI<Integer> af(){
    FileI<Integer> fifo = Fabrique.creerFile(capacity);
    //  // � compl�ter
    return fifo;
  }
 
  public boolean repOk(){
      return  /* � compl�ter && */ capacity()>0 && size()<=capacity();
  }
  

}
