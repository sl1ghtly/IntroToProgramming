/* Practical P05C- Question 2
Eryk Gloginski
04/11/2020
Program to calculate a bonus if a sales target has been met*/

import java.util.Scanner;

public class SalaryBonus
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   double salesTarget, saleAmount, salary, salaryWithBonus, basicBonus, daysMissed, extraBonus;
   
   salesTarget = 6000;
   basicBonus = 200;
   
   // prompt for input and take variable
   System.out.println("Enter your Salary(Amount Per Month): ");
   salary = input.nextDouble();
   System.out.println("Enter how many days you have missed in a Year: ");
   daysMissed = input.nextDouble();
   System.out.println("Enter your Sale Amount: ");
   saleAmount = input.nextDouble();
   
   if(saleAmount >= salesTarget)
   {
      salaryWithBonus = salary + basicBonus;
      
      if(daysMissed <= 2)
      {
         extraBonus = basicBonus * 0.20;
         salaryWithBonus = extraBonus + basicBonus + salary;
         System.out.println("Since you missed a couple of days, you get a 20% bonus.");
         System.out.println("With your bonus, you earn: " + salaryWithBonus); 
      }
      else if(daysMissed < 6 && daysMissed > 2)
      {
         extraBonus = basicBonus * 0.10;
         salaryWithBonus = extraBonus + basicBonus + salary;
         System.out.println("Since you missed a couple of days, you get a 10% bonus.");
         System.out.println("With your bonus, you earn: " + salaryWithBonus);
      }
      else
      {  
         System.out.println("Since you missed over 20 days, you get no extra bonus.");
         System.out.println("Without your normal bonus, you earn: " + salaryWithBonus);
      }
   }
   else
   {
      System.out.println("Salary without Bonus: " + salary);
   }
   }
}