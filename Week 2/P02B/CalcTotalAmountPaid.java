/* Practical P02B- Question 4
Eryk Gloginski
08/10/2020
Program to enter price of 3 items on sale where discount is applied
and display gross amount of 3 items, discount earned and total
amount due*/

import java.util.Scanner;

public class CalcTotalAmountPaid
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double itemPrice1, itemPrice2, itemPrice3, totalGross, discount, totalAmount;
      
      // take input to variables
      System.out.println("Enter the first item price: ");
      itemPrice1 = input.nextDouble();
      System.out.println("Enter the second item price: ");
      itemPrice2 = input.nextDouble();
      System.out.println("Enter the third item price: ");
      itemPrice3 = input.nextDouble();
      
      // calculate input and display
      totalGross = itemPrice1 + itemPrice2 + itemPrice3;
      System.out.println("Total Gross: " + totalGross);
      discount = totalGross * 0.10;
      System.out.println("You save " + discount + " due to a discount");
      totalAmount = totalGross - discount;
      System.out.println("Total amount paid: " + totalAmount);

      
      }
   
}
