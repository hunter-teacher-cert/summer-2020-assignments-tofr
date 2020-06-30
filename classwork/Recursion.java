/**
   Day 0 classwork
   recursion
   T. Mykolyk & F. Dragon, June 2020
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
    System.out.printf("fib(1) = %d\n", fib(1) );
    System.out.printf("fib(2) = %d\n", fib(2) );
    System.out.printf("fib(3) = %d\n", fib(3) );
    System.out.printf("fib(4) = %d\n", fib(4) );
    System.out.printf("fib(5) = %d\n", fib(5) );
    System.out.printf("fib(9) = %d\n", fib(9) );
  }


  public static int factorial(int n)
  {
    if (n<3)
      return n;
    else
      return n * factorial(n-1);
  }


  public static int fib(int n)
  {
    if (n<2)
      return n;
    else
      return fib(n-1) + fib(n-2);
  }

}
