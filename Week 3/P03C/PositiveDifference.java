/* Practical P03C- Question 3
Eryk Gloginski
15/10/2020
Program to tell the user the positive difference between two numbers*/

import java.util.Scanner;

public class PositiveDifference
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num1, num2, difference;
   
   // prompt for input and take variable
   System.out.println("Enter first number: ");
   num1 = input.nextInt();
   System.out.println("Enter second number: ");
   num2 = input.nextInt();
   
   // if else statement to see if num1 is a multiple of num2
   if(num2 >= num1)
   {
      difference = num2 - num1;
      System.out.println("The positive difference is: " + difference);
   }
   else
   {
      difference = num1 - num2;
      System.out.println("The positive difference is: " + difference);
   }
   
   } // end main method
} // end class
