/* Practical P06C- Question 1
Eryk Gloginski
13/11/2020
Pseudocode program*/

/*

GET mobile phone plan type (D or T)
IF plan type is D or d
   SET monthly payment to 25
   GET number of texts sent
   IF number of texts > 100
      ADD text cost to monthly payment (( texts – 100) * .07))
      DISPLAY text cost
      
ELSE IF plan type is T or t
   SET monthly payment to 20
   GET amount of data used
      IF amount of data used > 10
      ADD data cost to monthly payment (( data – 10) * .01))
      DISPLAY data cost
      
DISPLAY monthly payment

*/

import java.util.Scanner;

public class MobilePlanType
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char mobileType;
   double monthlyPayment, amountOfDataUsed;
   int numberOfTextsSent;
   
   System.out.println("Please enter your mobile data plan (D or T): ");
   mobileType = input.next().charAt(0);
   monthlyPayment = 0;
   
   if (mobileType == 'D' || mobileType == 'd')
   {
      monthlyPayment = 25;
      System.out.println("How many texts have you sent this month? ");
      numberOfTextsSent = input.nextInt();
      if (numberOfTextsSent > 100)
      {
         monthlyPayment = monthlyPayment + ((numberOfTextsSent - 100) * .07);
         System.out.println("Text cost: " + ((numberOfTextsSent - 100) * .07));
      }
   }
   
   else if (mobileType == 'T' || mobileType == 't')
   {
      monthlyPayment = 20;
      System.out.println("How much data have you used this month? ");
      amountOfDataUsed = input.nextDouble();
      if (amountOfDataUsed > 10)
      {
         monthlyPayment = monthlyPayment + ((amountOfDataUsed - 10) * .01);
         System.out.println("Data cost: " + ((amountOfDataUsed - 10) * .01));
      }
   }
   
   System.out.println("Your total monthly payment is: " + monthlyPayment);
   }
}