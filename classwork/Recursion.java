/**
   classwork -- Day 0
   recursion
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Recursion
{

  public static void main( String[] args )
  {
    System.out.println("Good News Everyone!");
    System.out.printf("1! = %d\n", factorial(1) );
    System.out.printf("2! = %d\n", factorial(2) );
    System.out.printf("3! = %d\n", factorial(3) );
    System.out.printf("4! = %d\n", factorial(4) );
    System.out.printf("5! = %d\n", factorial(5) );
    /*--v------move-me-down-one-test-at-a-time-----------v--
      ==^================================================^==*/

    System.out.printf("fib(1) = %d\n", fib(1) );
    System.out.printf("fib(2) = %d\n", fib(2) );
    System.out.printf("fib(3) = %d\n", fib(3) );
    System.out.printf("fib(4) = %d\n", fib(4) );
    System.out.printf("fib(5) = %d\n", fib(5) );
    System.out.printf("fib(9) = %d\n", fib(9) );
    /*--v------move-me-down-one-test-at-a-time-----------v--
      ==^================================================^==*/

    /*--v------move-me-down-one-test-at-a-time-----------v--
      ==^================================================^==*/

    /*--v------move-me-down-one-test-at-a-time-----------v--
      System.out.printf("recursiveSum([0] = %d\n", recursiveSum([0])
      System.out.printf("recursiveSum([1] = %d\n", recursiveSum([1])
      System.out.printf("recursiveSum([2] = %d\n", recursiveSum([2])
      System.out.printf("recursiveSum([0,1] = %d\n", recursiveSum([0,1])
      System.out.printf("recursiveSum([1,2] = %d\n", recursiveSum([1,2])
      ==^================================================^==*/

  }//end main()


  public static int factorial(int n)
  {
    if (n<3)
      return n;
    else
      return n * factorial(n-1);
  }//end fac()


  public static int fib(int n)
  {
    if (n<2)
      return n;
    else
      return fib(n-1) + fib(n-2);
  }//end fib()


  //insert ackerman fr; pre-work 5 exer 8

  /**
     challenge:
     Write a recursive function that will find the sum of the elements of an integer array.
     If you would like a skeleton method, you can start here:
  **/
  public static int recursiveSum(int[] ia)
  {
    int retInt = 0;
    return retInt;
  }//end recSum()


}//end class
