/* Practical P03A- Question 2
Eryk Gloginski
13/10/2020
Program to check if you achieved a passing grade*/

import java.util.Scanner;

public class ExamMarkPass
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int examMark = 0;
   
   // prompt for input and take variable
   System.out.print("Please enter your grade: ");
   examMark = input.nextInt();
   
   // if else statement if mark is bigger than 39 = pass else fail
   if(examMark >= 40)
   {
      System.out.println("You Passed");
   }
   else
   {
      System.out.println("You Failed");
   }
   
   } // end main method
} // end class
