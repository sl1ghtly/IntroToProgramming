/* Practical P05A- Question 4
Eryk Gloginski
03/11/2020
Program to check for month number and display a season*/

import java.util.Scanner;

public class CheckSeason
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   int month;
   
   // prompt for input and take variable
   System.out.println("Enter a month number: ");
   month = input.nextInt();
   
   // switch statement
   switch(month)
   {
      case 2:
      case 3:
      case 4:
         System.out.println("It is Spring.");
         break;
      case 5:
      case 6:
      case 7:
         System.out.println("It is Summer.");
         break;
      case 8:
      case 9:
      case 10:
         System.out.println("It is Autumn.");
         break;
      case 11:
      case 12:
      case 1:
         System.out.println("It is Winter.");
         break;
      default: System.out.print("Invalid Input");
   }
   }
}