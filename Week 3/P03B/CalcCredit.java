/* Practical P03B- Question 3
Eryk Gloginski
14/10/2020
Program to determine if credit limit has been exceeded*/

import java.util.Scanner;

public class CalcCredit
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double creditLimit, datedPurchases, todayPurchase, limitExceeded, totalCredit;
   creditLimit = 1000;
   
   System.out.println("Credit Limit: \t\t " + creditLimit);
   
   // prompt for input and take variable
   System.out.println("Enter Purchases to Date: ");
   datedPurchases = input.nextDouble();
   System.out.println("Enter Today's Purchases: ");
   todayPurchase = input.nextDouble();
      
   totalCredit = datedPurchases + todayPurchase; 
   limitExceeded = totalCredit - creditLimit;  
   
   // if statement
   if(creditLimit <= totalCredit)
   {  
      System.out.println("Credit limit exceeded by \t " + limitExceeded);
   }
   else
   { 
      System.out.println("Credit limit has not been exceeded. Current credit: " + totalCredit);
   }
   
   } // end main method
} // end class
