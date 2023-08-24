/* Practical P07A- Question 2
Eryk Gloginski
17/11/2020
Program to terminate when user puts a valid subject result.*/

import java.util.Scanner;

public class ValidResult
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int result;
   
   System.out.println("Enter your result in a subject: ");
   result = input.nextInt();
   
   while (result < 0 || result > 100)
   {
      System.out.println("Enter your result in a subject: ");
      result = input.nextInt();
   }
   
   System.out.println("Valid result: " + result);
   }
}