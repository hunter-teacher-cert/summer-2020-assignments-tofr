import java.io.*;
import java.util.*;

public class SuperArray
{
  private int[] data;
  private int numberElements;

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

  public void add( int value )
  {
    // test to see if we need to grow, then grow


    // add item
  }

  public void add(int index, int value){
    // see if there's enough room

    // shift the items down

    // insert the item

    // increment numElements

  }

  public void remove(int index){

    // shift items down to remove the item at index

    // subtract fom numElements;

  }

  public boolean isEmpty(){
    return numberElements == 0;
  }

  public int get(int index){
    return data[index];
  }

  public String toString(){
    String s = "";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    return s;
  }
  public String debug(){
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }

  private void grow(){
    // create a new array with extra space

    // copy over all the elements from the old array to the new one

    // point data to the new array

  }
}
