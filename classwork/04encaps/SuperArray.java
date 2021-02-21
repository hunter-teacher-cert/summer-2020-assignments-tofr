/**
   classwork -- Day 4
   encapsulation / SuperArray

   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary

   M. Zamansky, J. Dyrland-Weaver, T. Mykolyk, F. Dragon
   June 2020
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    data = new int[size];
    numberElements = 0;
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    this(10);
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow

    if (numberElements == data.length){
      grow();
    }

    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements = numberElements + 1;

  }//end add()


  public void add(int index, int value)
  {
    // see if there's enough room
    if ( numberElements == data.length ){
      grow();
    }

    // shift the items down
    for( int i=numberElements; i > index ; i--) { //traverse R-to-L. (Why?)
      data[i]=data[i-1];
    }

    // insert the item
    data[index] = value;

    // increment numberElements
    numberElements++ ;
  }//end add(i,i)


  public void remove(int index)
  {
    // shift items down to remove the item at index
    for( int i=index; i<numberElements-1; i++ ){
      data[i] = data[i+1];
    }
    // subtract fom numElements;
    numberElements--;
  }//end remove()


  public boolean isEmpty()
  {
    return numberElements == 0;
  }


  public int get(int index)
  {
    return data[index];
  }


  public int set(int index, int newVal)
  {
    int oldVal = data[index];
    data[index] = newVal;
    return oldVal;
  }


  public String toString()
  {
    String s = "";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    return s;
  }//end toString()


  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int newSize = data.length + (data.length / 2);
    int[] newData = new int[newSize];

    // copy over all the elements from the old array to the new one
    for( int i=0; i<numberElements; i++ ){
      newData[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = newData;

  }//end grow()

}//end class
