/* Practical P03A- Question 6
Eryk Gloginski
13/10/2020
Program to check for an even number*/

import java.util.Scanner;

public class CheckEvenNumber
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int number;
   
   // prompt for input and take variable
   System.out.print("Enter a number: ");
   number = input.nextInt();
   
   // if else statement if number is even and if its not even 
   if(number % 2 == 0)
   {
      System.out.print("The number " + number + " is even");
   }
   else
   {
      System.out.print("The number " + number + " is not even");
   }
   
   } // end main method
} // end class
