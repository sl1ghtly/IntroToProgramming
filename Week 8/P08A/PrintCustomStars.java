/* Practical P08A- Question 3
Eryk Gloginski
24/11/2020
Program to print '*' a custom amount of times.*/

import java.util.Scanner;

public class PrintCustomStars
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int amount;
   
   System.out.println("Enter a value: ");
   amount = input.nextInt();
   
   // for loop
   for (int count = 1; count <= amount; count++)
   {
      System.out.print("*");
   }
   }
}