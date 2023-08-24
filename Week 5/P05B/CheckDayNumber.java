/* Practical P05B- Question 2
Eryk Gloginski
03/11/2020
Program to enter day of the week via number 1 = mon etc. and display message*/

import java.util.Scanner;

public class CheckDayNumber
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   int day;
   
   // prompt for input and take variable
   System.out.println("Enter a day in numbers(1 - 7): ");
   day = input.nextInt();
   
   // switch statement
   switch(day)
   {
      case 1:
      case 2:
      case 3:
      case 4:
         System.out.println("Weekday: " + day);
         break;
      case 5:
      case 6:
      case 7:
         System.out.println("The weekend is here! " + day);
         break;
      default: System.out.print("Incorrect Day! " + day);
   }
   }
}