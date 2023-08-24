/* Practical P04C- Question 2
Eryk Gloginski
22/10/2020
Program to display time in other places based on time in Ireland*/

import java.util.Scanner;

public class MultipleTimezones
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int localTime, time1, time2, time3;
   int ans1, ans2, ans3 = 0;
   time1 = 5;
   time2 = 8;
   time3 = -10;

   // prompt for input and take variable
   System.out.println("Enter your local time: ");
   localTime = input.nextInt();
   
   // if else statement
   if(localTime > 24)
   {
      System.out.println("Invalid Time!");
   }
   else if(localTime < 0)
   {
      System.out.println("Invalid Time!");
   }
   // nested if statement
   else
   {
      // declare ansX variable
      ans1 = localTime - time1;
      ans2 = localTime - time2;
      ans3 = localTime - time3;
      
      // timezone New York
      if (ans1 < 0)
      {
         ans1 = ans1 + 24;
         System.out.println("Time in New York: " + ans1);
      }
      else
      {
         System.out.println("Time in New York: " + ans1);
      }
      
      // timezone San Francisco
      if (ans2 < 0)
      {
         ans2 = ans2 + 24;
         System.out.println("Time in San Francisco: " + ans2);
      }
      else
      {
         System.out.println("Time in San Francisco: " + ans2);
      }
      
      // timezone Sidney
      if (ans3 > 24)
      {
         ans3 = ans3 - 24;
         System.out.println("Time in Sidney: " + ans3);
      }
      else
      {
         System.out.println("Time in Sidney: " + ans3);
      }
   }
   } // end main method
} // end class
