/* Practical P07A- Question 6
Eryk Gloginski
17/11/2020
Program to terminate when you guess 7 as the number.*/

import java.util.Scanner;

public class GuessingGame3
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int guess = 7;
   int guessTry = 1;
   
   System.out.println("Welcome to the guessing game");
   System.out.println("Guess a number between 1 and 10");
   System.out.println("Enter your guess: ");
   guess = input.nextInt();
   
   while (guess != 7)
   {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      guessTry++;
      if (guess > 7)
      {
         System.out.println("Too high!");
      }
      if (guess < 7)
      {
         System.out.println("Too low!");
      }
   }
   
   System.out.println("Well done - you got it in " + guessTry + " guesses");
   }
}