/* Practical P02C- Question 5
Eryk Gloginski
08/10/2020
Program to take input of hours worked in a week and calculate total wage with tax, prsi and usc */

import java.util.Scanner;

public class CalcTaxWageExercise
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double hoursWorked, ratePerHour, wage, taxWage, prsiWage, uscWage, totalDeductions, totalWage;
      double tax = 0.40;
      double prsi = 0.05;
      double usc = 0.02;
      
      // take input to variables
      System.out.println("What is your name? ");
      String name = input.nextLine();
      System.out.println("How many hours have you worked? ");
      hoursWorked = input.nextDouble();
      System.out.println("What is your rate per hour? ");
      ratePerHour = input.nextDouble();

      // calculate input and display
      wage = ratePerHour * hoursWorked;
      taxWage = wage * tax;
      prsiWage = taxWage * prsi;
      uscWage = prsiWage * usc;
      totalDeductions = wage - taxWage - prsiWage - uscWage;
      totalWage = wage - totalDeductions;
      System.out.println("*********************************************************************");
      System.out.println("                    " + name);
      System.out.println("*********************************************************************");
      System.out.println("Hours: " + hoursWorked + "\t\t Rate: " + ratePerHour + "\t\t Gross Pay: " + wage);
      System.out.println("LESS DEDUCTIONS:");
      System.out.println("Tax: " + taxWage + "\t USC: " + uscWage + "\t PRSI: " + prsiWage + "\t\t Total Deductions: " + totalDeductions);
      System.out.println("");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tNET PAY: " + totalWage);
      System.out.println("*********************************************************************");
      
      }

}
