/* Practical P04A- Question 4
Eryk Gloginski
20/10/2020
Program to read time in 24h format and to convert it to PM or AM*/

import java.util.Scanner;

public class DetermineAMorPM
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int hours, minutes, pmTime, amTime;

   // prompt for input and take variable
   System.out.println("Enter the time (Hours): ");
   hours = input.nextInt();
   System.out.println("Enter the time (Minutes): ");
   minutes = input.nextInt();
   
   // if else statement
   if(hours > 24 || minutes > 59)
   {
      System.out.println("Invalid time: " + hours + ":" + minutes);
   }
   else if(hours > 12)
   {
      pmTime = hours - 12;
      System.out.println("Time: " + pmTime + ":" + minutes + " PM");
   }
   else
   {
      amTime = hours;
      System.out.println("Time: " + amTime + ":" + minutes + " AM");
   }
   
   } // end main method
} // end class
