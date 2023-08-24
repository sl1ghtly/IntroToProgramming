/* Practical P02B- Question 3
Eryk Gloginski
08/10/2020
Program to input price of item, amount tendered and display change due*/

import java.util.Scanner;

public class CalcChange
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double itemPrice, amountPaid, changeDue;
      
      // take input to variables
      System.out.println("Enter the item price: ");
      itemPrice = input.nextDouble();
      System.out.println("Enter the amount tendered: ");
      amountPaid = input.nextDouble();
      
      // calculate input and display
      changeDue = amountPaid - itemPrice;
      System.out.println("Your change: " + changeDue);
      
      }
   
}
