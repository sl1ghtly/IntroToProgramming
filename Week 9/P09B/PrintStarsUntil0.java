/* Practical P09B- Question 3
Eryk Gloginski
02/12/2020
Program to print stars.*/

import java.util.Scanner;

public class PrintStarsUntil0
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int stars = 0;
   
   // do while loop
   do
   {
      System.out.println("Enter amount of stars ");
      stars = input.nextInt();
      for (int count = 1; count <= stars; count++)
      {
         System.out.print("* ");
      }
      System.out.println();
   }while (stars != 0);
   }
}