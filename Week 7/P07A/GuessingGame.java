/* Practical P07A- Question 4
Eryk Gloginski
17/11/2020
Program to terminate when you guess 7 as the number.*/

import java.util.Scanner;

public class GuessingGame
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int guess = 7;
   
   System.out.println("Welcome to the guessing game");
   System.out.println("Guess a number between 1 and 10");
   System.out.println("Enter your guess: ");
   guess = input.nextInt();
   
   while (guess != 7)
   {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
   }
   
   System.out.println("Well done");
   }
}