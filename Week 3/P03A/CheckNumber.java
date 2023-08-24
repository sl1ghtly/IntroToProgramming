/* Practical P03A- Question 3
Eryk Gloginski
13/10/2020
Program to check if a number is bigger than 100 or not*/

import java.util.Scanner;

public class CheckNumber
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int randomNum = 0;
   
   // prompt for input and take variable
   System.out.print("Please enter your random Number: ");
   randomNum = input.nextInt();
   
   // if else statement if randomNum is bigger than 100 it will say so
   if(randomNum >= 100)
   {
      System.out.println(randomNum + " is as big as 100 or bigger than 100");
   }
   else
   {
      System.out.println(randomNum + " is not bigger than 100");
   }
   
   } // end main method
} // end class
