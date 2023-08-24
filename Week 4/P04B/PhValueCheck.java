/* Practical P04B- Question 3
Eryk Gloginski
22/10/2020
Program to check the pH value*/

import java.util.Scanner;

public class PhValueCheck
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int phValue;

   // prompt for input and take variable
   System.out.println("Enter a pH value: ");
   phValue = input.nextInt();
   
   // if else statement
   if(phValue >= 0 & phValue < 7)
   {
      System.out.println("Acidic");
   }
   else if(phValue > 7 & phValue <= 14)
   {
      System.out.println("Alkaline");
   }
   else if(phValue == 7)
   {
      System.out.println("Neutral");
   }
   else
   {
      System.out.println("Invalid Entry");
   }
   } // end main method
} // end class
