/* Practical P08C- Question 1
Eryk Gloginski
27/11/2020
Program to take in amount of houses sold and take in each value of it and lastly calculate the comission price.*/

import java.util.Scanner;

public class HouseComission
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int houses;
   double value = 0;
   double total = 0;
   double comission;
   
   System.out.println("Enter amount of houses sold this month.");
   houses = input.nextInt();
   
   // for loop
   for (int count = 1; count <= houses; count++)
   {
      System.out.println("Enter the price for house " + count + ".");
      value = input.nextDouble();
      total = total + value;
   }
   comission = total * 0.01;
   System.out.println("Comission: " + comission + ".");
   }
}