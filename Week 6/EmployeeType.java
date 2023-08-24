/* CA1
Eryk Gloginski
12/11/2020
Pseudocode + Java Program*/

/*

GET type

IF type = S or s
   GET Salary
   GET Time Worked
   GET Cars Sold
   GET Van Sold
   
   CALC Monthly Salary
   
   IF Time Worked
      DISPLAY Didn't work for 2 years minimum, No bonus
      Extra Bonus = 0
      
      IF Cars Sold < 1
         Car Bonus = 0
      THEN Cars Sold = 1
         Car Bonus = 0
      THEN Cars Sold >= 2 AND <= 4
         Car Bonus = 0
      ELSE 
         Car Bonus = 0
      
      IF Vans Sold > 5
         CALC Van Bonus
      ELSE
         CALC Van Bonus
      
      CALC Total Bonus
      CALC Total Payment
   THEN Time Worked > 5
      Extra Bonus = 750
      
      IF Cars Sold < 1
         CALC Car Bonus
      THEN Cars Sold = 1
         CALC Car Bonus
      THEN Cars Sold >= 2 AND <= 4
         CALC Car Bonus
      ELSE 
         CALC Car Bonus
      
      IF Vans Sold > 5
         CALC Van Bonus
      ELSE
         CALC Van Bonus
         
      CALC Total Bonus
      CALC Total Payment
      DISPLAY Car Bonus
      DISPLAY Van Bonus
      DISPLAY Extra Bonus
      DISPLAY Total Bonus
      DISPLAY Total Payment
      DISPLAY Cars Sold AND Vans Sold
      
   ELSE
      Extra Bonus = 750
      
      IF Cars Sold < 1
         CALC Car Bonus
      THEN Cars Sold = 1
         CALC Car Bonus
      THEN Cars Sold >= 2 AND <= 4
         CALC Car Bonus
      ELSE 
         CALC Car Bonus
      
      IF Vans Sold > 5
         CALC Van Bonus
      ELSE
         CALC Van Bonus
         
      CALC Total Bonus
      CALC Total Payment
      DISPLAY Car Bonus
      DISPLAY Van Bonus
      DISPLAY Extra Bonus
      DISPLAY Total Bonus
      DISPLAY Total Payment
      DISPLAY Cars Sold AND Vans Sold
   
THEN type = M or m
   GET Salary
   DISPLAY Annual Salary
   DISPLAY Monthly Salary

ELSE
   DISPLAY Error

*/

import java.util.Scanner;

public class EmployeeType
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char employeeType;
   double annualSalary, monthlySalary, yearBonus, vanBonus, carBonus, extraBonus, totalBonus, totalPayment;
   int yearsWorked, carsSoldMonth, vansSoldMonth;
   
   // prompt for input and take variable
   System.out.println("Please enter you employee type (S for sales, M for mechanic) ");
   employeeType = input.next().charAt(0);
   
   // Sale Employee
   if (employeeType == 'S' || employeeType == 's')
   {
      // take variables for sales employee
      System.out.println("Please enter your annual salary: ");
      annualSalary = input.nextDouble();
      System.out.println("How many years have you worked here? ");
      yearsWorked = input.nextInt();
      System.out.println("How many cars did you sell this month? ");
      carsSoldMonth = input.nextInt();
      System.out.println("How many vans did you sell this month? ");
      vansSoldMonth = input.nextInt();
      
      // calc monthly salary
      monthlySalary = annualSalary / 12;
      
      System.out.println("Annual Salary: " + annualSalary);
      System.out.println("Annual Salary: " + monthlySalary);
            
      if (yearsWorked < 2)
      {
         System.out.println("As you have worked here for less than two years, you do not qualify for a bonus ");
         extraBonus = 0;
         
         if (carsSoldMonth < 1)
         {
          carBonus = 0;
         }
         else if (carsSoldMonth == 1)
         {
            carBonus = 0;
         }
         else if (carsSoldMonth >= 2 && carsSoldMonth <= 4)
         {
            carBonus = 0;
         }
         else 
         {
            carBonus = 0;
         }
         
         if (vansSoldMonth >= 5)
         {
            vanBonus = vansSoldMonth * 1000;
         }
         else
         {
            vanBonus = vansSoldMonth * 1000;
         }
         
         totalBonus = carBonus + vanBonus + extraBonus;
         totalPayment = totalBonus + monthlySalary;
         
         System.out.println("Total payment for this month: " + totalPayment);
         System.out.println("This month you sold " + carsSoldMonth + " car and " + vansSoldMonth + " van");
      }
      else if (yearsWorked > 5)
      {
         extraBonus = 750;
         if (carsSoldMonth < 1)
         {
          carBonus = 0;
         }
         else if (carsSoldMonth == 1)
         {
            carBonus = annualSalary * 0.05;
         }
         else if (carsSoldMonth >= 2 && carsSoldMonth <= 4)
         {
            carBonus = annualSalary * 0.07;
         }
         else 
         {
            carBonus = annualSalary * 0.10;
         }
         
         if (vansSoldMonth >= 5)
         {
            vanBonus = vansSoldMonth * 1200;
         }
         else
         {
            vanBonus = vansSoldMonth * 1000;
         }
         
         totalBonus = carBonus + vanBonus + extraBonus;
         totalPayment = totalBonus + monthlySalary;
         
         System.out.println("Car sales bonus: " + carBonus);
         System.out.println("Van sales bonus: " + vanBonus);
         System.out.println("Long service bonus: " + extraBonus);
         System.out.println("Total bonus: " + totalBonus);
         System.out.println("Total payment for this month: " + totalPayment);
         System.out.println("This month you sold " + carsSoldMonth + " cars and " + vansSoldMonth + " vans");
      }
      else
      {
         extraBonus = 0;
         if (carsSoldMonth < 1)
         {
          carBonus = 0;
         }
         else if (carsSoldMonth == 1)
         {
            carBonus = annualSalary * 0.05;
         }
         else if (carsSoldMonth >= 2 && carsSoldMonth <= 4)
         {
            carBonus = annualSalary * 0.07;
         }
         else 
         {
            carBonus = annualSalary * 0.10;
         }
         
         if (vansSoldMonth >= 5)
         {
            vanBonus = vansSoldMonth * 1200;
         }
         else
         {
            vanBonus = vansSoldMonth * 1000;
         }
         
         totalBonus = carBonus + vanBonus + extraBonus;
         totalPayment = totalBonus + monthlySalary;
         
         System.out.println("Car sales bonus: " + carBonus);
         System.out.println("Van sales bonus: " + vanBonus);
         System.out.println("Long service bonus: " + extraBonus);
         System.out.println("Total bonus: " + totalBonus);
         System.out.println("Total payment for this month: " + totalPayment);
         System.out.println("This month you sold " + carsSoldMonth + " cars and " + vansSoldMonth + " vans");
      }
      
   }
   
   // Mechanic Employee
   else if (employeeType == 'M' || employeeType == 'm')
   {
      System.out.println("Please enter your annual salary: ");
      annualSalary = input.nextDouble();
      
      monthlySalary = annualSalary / 12;
      System.out.println("Annual Salary: " + annualSalary);
      System.out.println("Annual Salary: " + monthlySalary);
   }
   
   // Invalid Type
   else
   {
      System.out.println("Invalid Employee Type! ");
   }
   }
}