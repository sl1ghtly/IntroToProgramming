/* Practical P04A- Question 1
Eryk Gloginski
20/10/2020
Program to tell the user if they failed, passed, got a merit or distinction depending on the input*/

import java.util.Scanner;

public class DetermineGrade
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int mark;
   String grade;
   
   // prompt for input and take variable
   System.out.println("Enter your grade mark: ");
   mark = input.nextInt();

   
   // if else statement
   if(mark >= 70)
   {
      grade = "Distinction";
      System.out.println("Grade: " + grade + " | Mark: " + mark);
   }
   else if(mark >= 55)
   {
      grade = "Merit";
      System.out.println("Grade: " + grade + " | Mark: " + mark);
   }
   else if(mark >= 40)
   {
      grade = "Pass";
      System.out.println("Grade: " + grade + " | Mark: " + mark);
   }
   else
   {
      grade = "Fail";
      System.out.println("Grade: " + grade + " | Mark: " + mark);
   }
   } // end main method
} // end class
