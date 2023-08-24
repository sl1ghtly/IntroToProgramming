/* Practical P03A- Question 7
Eryk Gloginski
13/10/2020
Program to read time in seconds and print it out as hours minutes and seconds*/

import java.util.Scanner;

public class ReadSeconds
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int seconds = 0;
   int minutes = 0;
   int hours = 0;
   int restSeconds = 0;
   int restMinutes = 0;
   
   // prompt for input and take variable
   System.out.print("Enter seconds to read: ");
   seconds = input.nextInt();
      
   // if statement to calculate time
   if(seconds >= 60)
   {
      restSeconds = seconds % 60;
      minutes = seconds / 60;
      restMinutes = minutes % 60;
      hours = minutes / 60;
   }
   System.out.println(seconds + " seconds is: ");
   System.out.println(hours + " hours, " + restMinutes + " minutes, " + restSeconds + " seconds");
   
   } // end main method
} // end class
