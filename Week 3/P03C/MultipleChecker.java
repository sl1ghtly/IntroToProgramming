/* Practical P03C- Question 2
Eryk Gloginski
15/10/2020
Program to tell the user if the first number is a multiple of the second*/

import java.util.Scanner;

public class MultipleChecker
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num1, num2, remainder;
   
   // prompt for input and take variable
   System.out.println("Enter first number: ");
   num1 = input.nextInt();
   System.out.println("Enter second number: ");
   num2 = input.nextInt();
   
   remainder = num2 % num1;
   
   // if else statement to see if num1 is a multiple of num2
   if(remainder == 0)
   {
      System.out.println(num1 + " is a multiple of " + num2);
   }
   else
   {
      System.out.println(num1 + " is not a multiple of " + num2);
   }
   
   } // end main method
} // end class
