/* Practical P03B- Question 1
Eryk Gloginski
14/10/2020
Program to take 2 numbers and display the smaller of both*/

import java.util.Scanner;

public class DisplaySmaller
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num1, num2;
   
   // prompt for input and take variable
   System.out.println("Enter a number to read: ");
   num1 = input.nextInt();
   System.out.println("Enter another number to read: ");
   num2 = input.nextInt();
      
   // if statement
   if(num1 > num2)
   {
      System.out.println(num1 + " is bigger");
   }
   else
   {
      System.out.println(num2 + " is bigger");
   }
   
   } // end main method
} // end class
