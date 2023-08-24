/* Practical P06A- Question 1
Eryk Gloginski
10/11/2020
Program to calculate the salary depending if you're part time, full time and if it's monthly or weekly for full time*/

import java.util.Scanner;

public class CheckSalaryPartFullTime
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char workerClass, monthlyOrWeekly;
   double hourlyRate, annualSalary, weeklyWage, monthlyWage;
   int hours;
   
   // prompt for input and take variable
   System.out.println("Are you a part time worker [P] or a full time worker [F]? ");
   workerClass = input.next().charAt(0);
   
   if (workerClass == 'P' || workerClass == 'p')
   {
      System.out.println("What is your hourly rate? ");
      hourlyRate = input.nextDouble();
      System.out.println("How many hours do you work per week? ");
      hours = input.nextInt();
      
      // calculate weekly wage
      weeklyWage = hourlyRate * hours;
      System.out.println("Your weekly wage is " + weeklyWage);
      
   }
   else if (workerClass == 'F' || workerClass == 'f')
   {
      System.out.println("What is your annual salary? ");
      annualSalary = input.nextDouble();
      System.out.println("Are you paid monthly [M] or weekly [W]? ");
      monthlyOrWeekly = input.next().charAt(0);
      
      // nested if statement
      if (monthlyOrWeekly == 'M' || monthlyOrWeekly == 'm')
      {
         // calculate + display
         monthlyWage = annualSalary / 12;
         System.out.println("Your monthly wage is " + monthlyWage);
      }
      else if (monthlyOrWeekly == 'W' || monthlyOrWeekly == 'w')
      {
         // calculate + display
         weeklyWage = (annualSalary / 12) / 4;
         System.out.println("Your weekly wage is " + weeklyWage);
      }
   }
   else
   {
      System.out.println("Invalid Option! ");
   }
   }
}