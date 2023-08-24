/* Practical P02C- Question 2
Eryk Gloginski
08/10/2020
Program to enter item and price and get a discount*/

import java.util.Scanner;

public class ProductDiscountPrice
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      
      double price, answer, finalAnswer;
      double discountPercent = 0.20;
      double discount = 20;
      
      // take input to variables
      System.out.println("Please enter product name: ");
      String item = input.nextLine();
      System.out.println("Please enter product price: ");
      price = input.nextDouble();

      
      // calculate input and display
      answer = price * discountPercent;
      finalAnswer = price - answer;
      System.out.println(item + " original price: " + price);
      System.out.println("Discount: " + discount);
      System.out.println("Final price: " + finalAnswer);
            
      }
   
}
