/* Practical P07B- Question 7
Eryk Gloginski
18/11/2020
Program to terminate when you enter the correct PIN or if you run out of 3 tries.*/

import java.util.Scanner;

public class CountPinTries2
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int pin = 1234;
   int pinGuess;
   int guessAmount = 0;
   
   do
   {
      System.out.println("Enter your PIN.");
      pinGuess = input.nextInt();
      guessAmount++;
      
   } while (pinGuess != 1234 && guessAmount != 3);
   System.out.println("Amount of tries: " + guessAmount);
   }
}