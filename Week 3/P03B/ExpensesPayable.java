/* Practical P03B- Question 4
Eryk Gloginski
14/10/2020
Program to determine if employee deserves a bonus for miles travelled*/

import java.util.Scanner;

public class ExpensesPayable
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   double milesTravelled, allowancePerMile, expenses, allowanceBonus;
   
   // prompt for input and take variable
   System.out.println("Enter miles travelled: ");
   milesTravelled = input.nextDouble();
   System.out.println("Enter allowance per mile: ");
   allowancePerMile = input.nextDouble();
      
   expenses = milesTravelled * allowancePerMile; 
   
   // if statement
   if(milesTravelled >= 150)
   {  
      allowanceBonus = expenses + 100;
      System.out.println("Payable Expenses to the employee: " + allowanceBonus + " (100+ BONUS)");
   }
   else
   { 
      System.out.println("Payable Expenses to the employee: " + expenses);
   }
   
   } // end main method
} // end class
