/* Practical P04B- Question 1
Eryk Gloginski
22/10/2020
Program from Pseudocode*/

/*
GET exam mark

IF mark is invalid
   DISPLAY error message
ELSE IF mark > 40
   DISPLAY “You have passed”
ELSE
   DISPLAY “You have failed”
*/

import java.util.Scanner;

public class GetExamMark
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int examMark;

   // prompt for input and take variable
   System.out.println("Enter your exam mark: ");
   examMark = input.nextInt();
   
   // if else statement
   if(examMark > 100)
   {
      System.out.println("Invalid Mark!");
   }
   else if(examMark >= 40)
   {  
      System.out.println("You passed! Mark: " + examMark);
   }
   else
   {
      System.out.println("You Failed! Mark: " + examMark);
   }
   } // end main method
} // end class
