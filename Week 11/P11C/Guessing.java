/* Practical P11C- Question 7
Eryk Gloginski
18/12/2020
Program to display numbers of days per month until -1 is entered*/

import java.util.Random;
import java.util.Scanner;

public class Guessing
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   Random gen = new Random();
   int randomNum, guess;
   int tryCounter = 0;
   randomNum = gen.nextInt(101);
   
   do
   {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      if (guess == randomNum)
      {
         tryCounter++;
         System.out.println("Well done. You got it in " + tryCounter + " turns. ");
      }
      else if (guess < randomNum)
      {
         tryCounter++;
         System.out.println("Incorrect - higher...");
      }
      else if (guess > randomNum)
      {
         tryCounter++;
         System.out.println("Incorrect - lower...");
      }
   }while (randomNum != guess);
   }
}