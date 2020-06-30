/**
   https://books.trinket.io/thinkjava/chapter3.html
   3.12
   Exercise 2
   Write a program that converts a temperature from Celsius to Fahrenheit.
   It should
   (1) prompt the user for input,
   (2) read a double value from the keyboard,
   (3) calculate the result, and
   (4) format the output to one decimal place.
   For example, it should display "24.0 C = 75.2 F".
   Here is the formula. Be careful not to use integer division!
   F = C * 9/5 + 32
   
   Topher & Fierce Dragon, June 2020
**/
import java.util.Scanner;

public class Exer02 {

  public static void main( String[] args ) {

    Scanner in = new Scanner(System.in);

    // (1) prompt the user for input,
    System.out.println(" tempC:");

    // (2) read a double value from the keyboard,
    double inTempC;
    inTempC = in.nextDouble();

    // (3) calculate the result, and
    double outTempF;
    outTempF = inTempC * 9/5. + 32;

    // (4) format the output to one decimal place.
    System.out.printf(" %.1f C",inTempC);
    System.out.print(" = ");
    System.out.printf("%.1f F",outTempF);
    System.out.println();

    // For example, it should display "24.0 C = 75.2 F".

  }

}
