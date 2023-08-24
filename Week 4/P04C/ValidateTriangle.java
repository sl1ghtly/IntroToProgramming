/* Practical P04C- Question 3
Eryk Gloginski
23/10/2020
Program to check if two sides of a triangle are greater than the third one*/

import java.util.Scanner;

public class ValidateTriangle
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int length1, length2, length3;

   // prompt for input and take variable
   System.out.println("Enter the first length: ");
   length1 = input.nextInt();
   System.out.println("Enter the second length: ");
   length2= input.nextInt();
   System.out.println("Enter the third length: ");
   length3 = input.nextInt();
   
   // if else statement
   if(length1 + length2 >= length3 || length1 + length3 >= length2 || length2 + length3 >= length1)
   {
      System.out.println("The triangle with the sides " + length1 + ", " + length2 + " and " + length3 + " is valid!");
   }
   else
   {
      System.out.println("The triangle with the sides " + length1 + ", " + length2 + " and " + length3 + " is invalid!");
   }
   } // end main method
} // end class
