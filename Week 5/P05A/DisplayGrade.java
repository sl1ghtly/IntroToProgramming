/* Practical P05A- Question 1
Eryk Gloginski
03/11/2020
Program to display message based on grade entered*/

import java.util.Scanner;

public class DisplayGrade
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char grade;
   
   // prompt for input and take variable
   System.out.println("Enter your grade: ");
   grade = input.next().charAt(0);
   
   // switch statement
   switch(grade)
   {
      case 'A':
      case 'a':
         System.out.println("Excellent student");
         break;
      case 'B':
      case 'b':
         System.out.println("Good student");
         break;
      case 'C': case 'c':
      case 'D': case 'd':
         System.out.println("Fair student");
         break;
      case 'E': case 'e':
      case 'F': case 'f':
         System.out.println("Poor Student");
         break;
      default: System.out.print("Invalid grade");
   }
   }
}