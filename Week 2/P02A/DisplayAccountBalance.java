/* Practical P02A- Question 6
Eryk Gloginski
06/10/2020
Program update bank account balance*/

import java.util.Scanner;

public class DisplayAccountBalance
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double currentBalance, amountToDeposit, answer;
      
      // take input to variables
      System.out.println("Enter your current bank account balance: ");
      currentBalance = input.nextDouble();
      System.out.println("Enter the amount you wish to deposit: ");
      amountToDeposit = input.nextDouble();
      
      // display input
      answer = currentBalance + amountToDeposit;
      System.out.println("Your new account balance after deposit: " + answer);
      
      }
   
}
