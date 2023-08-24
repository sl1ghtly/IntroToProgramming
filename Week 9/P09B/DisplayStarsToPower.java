/* Practical P09B- Question 4
Eryk Gloginski
02/12/2020
Program to enter a number and display it's Square and Cube*/

import java.util.Scanner;

public class DisplayStarsToPower
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int number;
   
   System.out.println("Enter a number: ");
   number = input.nextInt();
   
   // for loop
   for (int count = 1; count <= number; count++)
   {
      for (int count2 = 1; count2 <= number; count2++)
      {
         System.out.print("* ");
      }
      System.out.println();
   }
   }
}