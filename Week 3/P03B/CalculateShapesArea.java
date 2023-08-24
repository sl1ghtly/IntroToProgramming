/* Practical P03B- Question 5
Eryk Gloginski
14/10/2020
Program to calculate area of Triangle or Rectangle*/

import java.util.Scanner;

public class CalculateShapesArea
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double length, height, answer;
   char shape;
   
   // prompt for input and take variable
   System.out.println("Enter Length: ");
   length = input.nextDouble();
   System.out.println("Enter Height: ");
   height = input.nextDouble();
   System.out.println("Enter Shape (T for Triangle or R for Rectangle): ");
   shape = input.next().charAt(0);
      
   // if statement
   if(shape == 'T')
   {  
      answer = (length * height) /2;
      System.out.println("Area of Triangle: " + answer);
   }
   else
   { 
      answer = length * height;
      System.out.println("Area of Rectangle: " + answer);
   }
   
   } // end main method
} // end class
