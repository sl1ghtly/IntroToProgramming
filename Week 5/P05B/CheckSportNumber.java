/* Practical P05B- Question 1
Eryk Gloginski
03/11/2020
Program to enter a sport and receive the number of people needed to form a team for defined sport*/

import java.util.Scanner;

public class CheckSportNumber
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   String sport;
   
   // prompt for input and take variable
   System.out.println("Enter a sport: ");
   sport = input.nextLine();
   
   // switch statement
   switch(sport)
   {
      case "Tennis": case "Badmington":
         System.out.println("Number of people needed: 1");
         break;
      case "Basketball":
         System.out.println("Number of people needed: 5");
         break;
      case "Hurling": case "Gaelic Football":
         System.out.println("Number of people needed: 15");
         break;
      case "Soccer":
         System.out.println("Number of people needed: 15");
         break;
      default: System.out.print("Unknown Sport");
   }
   }
}