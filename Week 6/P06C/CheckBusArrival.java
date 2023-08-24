/* Practical P06C- Question 3
Eryk Gloginski
13/11/2020
Program to find out bus arrival time*/

import java.util.Scanner;

public class CheckBusArrival
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   int hours, minutes, wait;
   
   System.out.println("Enter hours: ");
   hours = input.nextInt();
   System.out.println("Enter minutes: ");
   minutes = input.nextInt();
   
   if (minutes < 30)
   {
      wait = 30 - minutes;
      minutes = minutes + wait;
      System.out.println("The next bus is at " + hours + ":" + minutes);
      System.out.println("Your wait is: " + wait);
   }
   else if (minutes < 60 && minutes > 30)
   {
      minutes = minutes;
      hours = hours + 1;
      wait = 60 - minutes;
      minutes = minutes + wait;
      minutes = 0;
      System.out.println("The next bus is at " + hours + ":" + minutes);
      System.out.println("Your wait is: " + wait);
   }
   else
   {
      System.out.println("Invalid time!");
   }
   }
}