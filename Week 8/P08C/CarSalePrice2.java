/* Practical P08C- Question 4
Eryk Gloginski
27/11/2020
Program to calculate the input price of a car as it deteriorates*/

import java.util.Scanner;

public class CarSalePrice2
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int years;
   double cost, deteriorate, deterioratePercent, total;
   
   System.out.println("Enter initial car cost: ");
   cost = input.nextDouble();
   System.out.println("Enter the rate at which the car deteriorates as a percent: ");
   deterioratePercent = input.nextDouble();
   System.out.println("Enter over how many years to calculate: ");
   years = input.nextInt();
   
   deteriorate = cost * deterioratePercent;
   total = cost;
   
   // for loop
   for (int count = 1; count <= years; count++)
   {
      total = total - deteriorate;
      System.out.println("Car deteriorated. Price for year " + count + ": " + total);
   }
   }
}