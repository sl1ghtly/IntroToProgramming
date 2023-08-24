/* Practical P05A- Question 2
Eryk Gloginski
03/11/2020
Program to display message based on grade entered without break*/

import java.util.Scanner;

public class DisplayGrade2
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
      // what happens is that when you remove the break statement
      // the program does not break out of the switch statement
      // therefore it displays the cases depending on which character you enter.
      case 'A':
      case 'a':
         System.out.println("Excellent student");
      case 'B':
      case 'b':
         System.out.println("Good student");
      case 'C': case 'c':
      case 'D': case 'd':
         System.out.println("Fair student");
      case 'E': case 'e':
      case 'F': case 'f':
         System.out.println("Poor Student");
      default: System.out.print("Invalid grade");
   }
   }
}