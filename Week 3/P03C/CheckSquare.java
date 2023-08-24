/* Practical P03C- Question 5
Eryk Gloginski
15/10/2020
Program to tell the user if the shape is a square*/

import java.util.Scanner;

public class CheckSquare
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int length, width;
   
   // prompt for input and take variable
   System.out.println("Enter length: ");
   length = input.nextInt();
   System.out.println("Enter width: ");
   width = input.nextInt();
   
   // if else statement to see if num1 is a multiple of num2
   if(length == width)
   {
      System.out.println("The shape is a square");
   }
   else
   {
      System.out.println("The shape is not a square");
   }
   
   } // end main method
} // end class
