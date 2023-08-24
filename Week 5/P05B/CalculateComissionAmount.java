/* Practical P05B- Question 3
Eryk Gloginski
03/11/2020
Program to enter a sale code and amount sold and receive the comission amount to pay*/

import java.util.Scanner;

public class CalculateComissionAmount
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   int code;
   double amountSold, comissionAmount;
   
   // prompt for input and take variable
   System.out.println("Enter sale code: ");
   code = input.nextInt();
   System.out.println("Enter amount sold: ");
   amountSold = input.nextDouble();
   
   // switch statement
   switch(code)
   {
      case 1:
         comissionAmount = amountSold * 0.05;
         System.out.println("Comission: 5% of " + amountSold);
         System.out.println("Comission paid: " + comissionAmount);
         break;
      case 2:
         comissionAmount = amountSold * 0.20;
         System.out.println("Comission: 20% of " + amountSold);
         System.out.println("Comission paid: " + comissionAmount);
         break;
      case 3:
         comissionAmount = amountSold * 0.10;
         System.out.println("Comission: 10% of " + amountSold);
         System.out.println("Comission paid: " + comissionAmount);
         break;
      case 4:
         comissionAmount = amountSold * 0.05;
         System.out.println("Comission: 5% of " + amountSold);
         System.out.println("Comission paid: " + comissionAmount);
         break;
      default: System.out.print("Unknown sale code: " + code);
   }
   }
}