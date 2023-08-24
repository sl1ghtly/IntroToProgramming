/* Practical P06C- Question 2
Eryk Gloginski
13/11/2020
Program to determine if a person is going into the EU or outside, and apply a discount if they aren't*/

import java.util.Scanner;

public class CheckIfGoingToEU
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char person;
   double totalPrice;
   
   System.out.println("Are you into the the EU? (Y/N) ");
   person = input.next().charAt(0);
   System.out.println("Enter your total amount paid: ");
   totalPrice = input.nextDouble();

   switch(person)
   {
   case 'Y':
   case 'y':
      totalPrice = totalPrice;
      break;
   case 'N':
   case 'n':
      totalPrice = totalPrice - (totalPrice * 0.21);
      break;
   default:
      System.out.println("Invalid input! Only Y or N! ");
   }
         
   System.out.println("Amount paid: " + totalPrice);
   }
}