/* Practical P03B- Question 6
Eryk Gloginski
14/10/2020
Program to determine if employee deserves overtime bonus*/

import java.util.Scanner;

public class OverpayBonus
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double hoursWorked, normalPay, overtimeHours, rateOfPay, bonusRateOfPay, overPay, finalPay;
   
   // prompt for input and take variable
   System.out.println("Enter hours worked: ");
   hoursWorked = input.nextDouble();
   System.out.println("Enter Rate of Pay: ");
   rateOfPay = input.nextDouble();
   
   normalPay = hoursWorked * rateOfPay;
   overtimeHours = hoursWorked - 38;
   bonusRateOfPay = rateOfPay * 1.5;
   
   // if statement
   if(hoursWorked > 38)
   {  
      normalPay = normalPay - (overtimeHours * rateOfPay);
      overPay = overtimeHours * bonusRateOfPay;
      finalPay = overPay + normalPay;
      System.out.println("Hours worked " + hoursWorked + " Money Paid: " + finalPay);
   }
   else
   { 
      System.out.println("Hours worked " + hoursWorked + " Money Paid: " + normalPay);
   }
   
   } // end main method
} // end class
