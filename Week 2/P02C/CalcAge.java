/* Practical P02C- Question 3
Eryk Gloginski
08/10/2020
Program to add 30 to age and years*/

import java.util.Scanner;

public class CalcAge
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      int age, year, answerAge, answerYear;
      int addNumber = 30;
      
      // take input to variables
      System.out.println("What is your name? ");
      String name = input.nextLine();
      System.out.println("How old are you? ");
      age = input.nextInt();
      System.out.println("What year is it? ");
      year = input.nextInt();

      // calculate input and display
      answerAge = age + addNumber;
      answerYear = year + addNumber;
      System.out.println("Hi " + name + ", in the year " + answerYear + " you will be " + answerAge);
            
      }
   
}
