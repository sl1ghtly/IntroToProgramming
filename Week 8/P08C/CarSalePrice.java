/* Practical P08C- Question 3
Eryk Gloginski
27/11/2020
Program to calculate the price of a car as it deteriorates*/

public class CarSalePrice
{
   public static void main(String [] args)
   {
   
   // declare variable
   int years = 10;
   double cost = 17000;
   double deteriorate = 1500;
   double total = cost;
   
   // for loop
   for (int count = 1; count <= years; count++)
   {
      total = total - deteriorate;
      System.out.println("Car deteriorated. Price for year " + count + ": " + total);
   }
   }
}