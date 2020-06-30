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

    System.out.printf("ack(0,0) = %d\n", ack(0,0) );
    System.out.printf("ack(0,1) = %d\n", ack(0,1) );
    System.out.printf("ack(1,1) = %d\n", ack(1,1) );
    System.out.printf("ack(1,2) = %d\n", ack(1,2) );
    System.out.printf("ack(1,3) = %d\n", ack(1,3) );
    System.out.printf("ack(2,1) = %d\n", ack(2,1) );
    System.out.printf("ack(2,2) = %d\n", ack(2,2) );
    System.out.printf("ack(2,3) = %d\n", ack(2,3) );
    System.out.printf("ack(3,1) = %d\n", ack(3,1) );
    System.out.printf("ack(3,2) = %d\n", ack(3,2) );
    System.out.printf("ack(3,3) = %d\n", ack(3,3) );
    /*--v------move-me-down-one-test-at-a-time-----------v--
      ==^================================================^==*/

    int[] a1 = {0};
    int[] a2 = {1};
    int[] a3 = {2};
    int[] a4 = {0,1};
    int[] a5 = {1,2};
    //int[] a = {};
    System.out.printf( "recursiveSum(a1) = %d\n", recursiveSum(a1) );
    System.out.printf( "recursiveSum(a2) = %d\n", recursiveSum(a2) );
    System.out.printf( "recursiveSum(a3) = %d\n", recursiveSum(a3) );
    System.out.printf( "recursiveSum(a4) = %d\n", recursiveSum(a4) );
    System.out.printf( "recursiveSum(a5) = %d\n", recursiveSum(a5) );
    /*--v------move-me-down-one-test-at-a-time-----------v--
      ==^================================================^==*/

  }//end main()


  public static int factorial(int n)
  {
    if (n<2)
      return 1;
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
     Ackerman fxn
     A(m, n) =
     ⎧
     ⎪
     ⎨
     ⎪
     ⎩
     n+1 if  m = 0
     A(m−1, 1) if  m > 0  and  n = 0
     A(m−1, A(m, n−1)) if  m > 0  and  n > 0
  **/
  public static int ack( int m, int n )
  {
    if (m==0) {
      return n+1;
    }
    else if (m>0 && n==0) {
      return ack(m-1, 1);
    }
    else if (m>0 && n>0) {
      return ack( m-1, ack(m, n-1) );
    }
    else
      return -1;
  }//end ack()


  /**
     challenge:
     Write a recursive function that will find the sum of the elements of an integer array.
     If you would like a skeleton method, you can start here:
  **/
  //assumes array length > 0
  public static int recursiveSum( int[] ia )
  {
    System.out.printf("len: %d\n", ia.length);
    return recSumHelper(ia, 0);
  } public static int recSumHelper( int[] iarr, int startPos )
  {
    int retInt = 0;
    int windowSize = iarr.length - startPos;
    //System.out.printf("len: %d\n", iarr.length);
    //System.out.printf("windowSize: %d\n", windowSize);

    if ( windowSize < 2 ) {
      System.out.print(iarr[startPos]);
      retInt = iarr[startPos];
    }
    else {
      retInt = iarr[startPos] + recSumHelper(iarr,startPos+1);
    }
    return retInt;
  }//end recSumHelper


}//end class
