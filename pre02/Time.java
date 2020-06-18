/**
 * pre-work 02
 * exercise 3
 * https://github.com/hunter-teacher-cert/pre-work/blob/master/pre02.org
 * https://books.trinket.io/thinkjava/chapter2.html
 **/

public class Time {

  public static void main( String[] args ) {

    int hour = 16;
    int minute = 30;
    int second = 23;

    int minutes = hour * 60;
    minutes = minutes + minute;
    int seconds = minute * 60;
    seconds = seconds + second;

    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");

    System.out.print("Number of seconds since midnight: ");
    System.out.println(seconds);

  }//end main

}//end class
