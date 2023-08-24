/* Practical P09A- Question 4
Eryk Gloginski
01/12/2020
Rewrite Do While Loop*/

import java.util.Scanner;

public class QuartersOfYear
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int quarter = 1;
   double quarterlySales = 0;
   double totalSales = 0;
   
   // for loop
   for (int count = 1; count <= 4; count++)
   {
      System.out.println("Enter quarterly sales for quarter " + count);
      quarterlySales = input.nextDouble();
      totalSales = totalSales + quarterlySales;
   }
   System.out.println("Total sales for the year: " + totalSales);
   }
}