/**
   classwork -- Day 3
   intro to classes & objects
   https://books.trinket.io/thinkjava/chapter11.html

   M. Zamansky, T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Time
{
  //instance variables
  private int hour;
  private int minute;
  private double second;

  //default constructor
  public Time()
  {
    //explicit:
    // this.hour = 0;
    // this.minute = 0;
    // this.second = 0.0;

    hour = 0;
    minute = 0;
    second = 0.0;
  }

  //overloaded constructor
  public Time(int hour, int minute, double second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  
  //"accessors" aka "getters"
  public int getHour()
  {
    return this.hour;
  }

  public int getMinute()
  {
    return this.minute;
  }

  public double getSecond()
  {
    return this.second;
  }

  
  //"mutators" aka "setters"
  public void setHour(int hour)
  {
    this.hour = hour;
  }

  public void setMinute(int minute)
  {
    this.minute = minute;
  }

  public void setSecond(int second)
  {
    this.second = second;
  }

  /*  
  public static void printTime(Time t)
  {
    System.out.print(t.hour);
    System.out.print(":");
    System.out.println(t.minute);
    System.out.print(":");
    System.out.println(t.second);
  }
  */

  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
                      t.hour, t.minute, t.second);
  }

  //~~~~~~~~~~~~~~~ begin OVERLOADED METHODS SECTION ~~~~~~~~~~~~~~~~~~
  //overload inherited toString()
  public String toString()
  {
    return String.format("%02d:%02d:%04.1f\n",
                         this.hour, this.minute, this.second);
  }

  
  //overload inherited equals()
  public boolean equals(Time that)
  {
    //simplest means of checking for Object equivalence:
    //compare corresponding instance var values...
    return this.hour == that.hour
      && this.minute == that.minute
      && this.second == that.second;
  }
  //~~~~~~~~~~~~~~~ end OVERLOADED METHODS SECTION ~~~~~~~~~~~~~~~~~~~~


  //static add() -- belongs to no specific Time instance
  // returns a Time object representing t1 advanced by t2
  public static Time add(Time t1, Time t2)
  {
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    return sum;
  }

  /* naive attempt at instance method version of add():
  public Time add(Time t2)
  {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;
    return sum;
  }
  */
  
  //improved add() -- now actually adds! (handles carrying)
  public Time add(Time t2)
  {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;

    if (sum.second >= 60.0) {
      sum.second -= 60.0;
      sum.minute += 1;
    }
    if (sum.minute >= 60) {
      sum.minute -= 60;
      sum.hour += 1;
    }
    return sum;
  }//end add()

  
  //increment this instance of Time by input number of seconds
  public void increment(double seconds)
  {
    this.second += seconds;
    while (this.second >= 60.0) {
      this.second -= 60.0;
      this.minute += 1;
    }
    while (this.minute >= 60) {
      this.minute -= 60;
      this.hour += 1;
    }
  }//end increment()
  
}//end Time
