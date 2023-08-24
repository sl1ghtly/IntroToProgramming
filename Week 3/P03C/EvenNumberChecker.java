/* Practical P03C- Question 6
Eryk Gloginski
15/10/2020
Program to tell the user if the number is odd or not*/

import java.util.Scanner;

public class EvenNumberChecker
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   
   // prompt for input and take variable
   System.out.println("Enter a number: ");
   num = input.nextInt();
   
   // if else statement to see if num1 is a multiple of num2
   if(num % 2 == 0)
   {
      System.out.println(num + " is an even number");
   }
   else
   {
      System.out.println(num + " is an odd number");
   }
   
   } // end main method
} // end class
