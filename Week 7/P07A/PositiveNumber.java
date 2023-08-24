/* Practical P07A- Question 1
Eryk Gloginski
17/11/2020
Program to terminate when user puts in a positive number.*/

import java.util.Scanner;

public class PositiveNumber
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   
   System.out.println("Enter a positive number: ");
   num = input.nextInt();
   
   while (num <= 0)
   {
      System.out.println("Enter a positive number: ");
      num = input.nextInt();
   } 
   }
}