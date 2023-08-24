/* Practical P04C- Question 1
Eryk Gloginski
22/10/2020
Program from Pseudocode*/

/*
GET hours
GET rate

IF hours or rate is invalid
   DISPLAY error message
ELSE
   CALC wages (hours * rate)

   IF hours > 45
      CALC and ADD bonus 20% (wage + (wages * .2)
   ELSE IF hours > 40
      CALC and ADD bonus 15% (wage + (wages * .15)
   ELSE IF hours > 37
      CALC and ADD bonus 10% (wage + (wages * .1)

   DISPLAY wages
*/

import java.util.Scanner;

public class GetHoursRateWages
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double hours, rate, wages, wage = 0;

   // prompt for input and take variable
   System.out.println("Enter your Hours: ");
   hours = input.nextDouble();
   System.out.println("Enter your Rate: ");
   rate = input.nextDouble();
   
   // if else nested statement
   if(hours <= 0 || rate <= 0)
   {  
      System.out.println("Invalid Hours or Rate");
   }
   else
   {
      wages = hours * rate;
      // nested if statement
      if(hours > 45)
      {
         wage = wages + (wages * 0.2);
      }
      else if(hours > 40)
      {
         wage = wages + (wages * 0.15);
      }
      else if(hours > 37)
      {
         wage = wages + (wages * 0.1);
      }
      wage = wages;
      System.out.println("Wage: " + wage);
   }
   } // end main method
} // end class
