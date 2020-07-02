/**
   classwork -- Day 3
   intro to classes & objects

   driver/tester file for class Time

   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Driver
{
  public static void main( String[] args )
  {
    //invoke default constructor
    Time t1 = new Time();
    System.out.println(t1);
    //System.out.printf(t1);

    //invoke overloaded constructor
    Time t2 = new Time(11, 59, 59.9);
    System.out.println(t2);
    //System.out.printf(t2);
    /*
      System.out.println(t2.hour);
      ...will generate this error:
      error: hour has private access in Time
    System.out.println(t2.hour);
    */

    Time time1 = new Time(9, 30, 0.0);
    Time time2 = time1; //make time2 an alias for time1 (point to same mem location)
    Time time3 = new Time(9, 30, 0.0);

    System.out.println("\n-----------------------");
    System.out.println("Testing equals()...");
    System.out.println( time1.equals(time2) ); //true
    System.out.println( time2.equals(time3) ); //true iff equals() properly overridden
    System.out.println( time1.equals(time3) ); //true iff equals() properly overridden

    Time startTime = new Time(18, 50, 0.0);
    Time runningTime = new Time(2, 16, 0.0);
    Time endTime = Time.add(startTime, runningTime);

    System.out.println("\n-----------------------");
    System.out.println("Testing add()...");
    System.out.println(startTime);
    System.out.println(runningTime);
    System.out.println(endTime);

    System.out.println("\n-----------------------");
    System.out.println("Testing startTime.increment(3)...");
    System.out.println(startTime);
    startTime.increment(3);
    System.out.println(startTime);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
  }//end main()

}//end Driver
