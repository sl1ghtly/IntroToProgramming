/* Practical P07C- Question 3
Eryk Gloginski
20/11/2020
Program to terminate when Q or q is entered and calculate based on A or S. Mini Calculator.*/

import java.util.Scanner;

public class MiniCalculator
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   char letter;
   int num1, num2;
   int total = 0;
   
   System.out.println("CALCULATION MENU");
   System.out.println("****************************");
   
   do
   {
      System.out.println("A - ADD");
      System.out.println("S - SUBTRACT");
      System.out.println("Q - QUIT");
      System.out.println("ENTER CHOICE [A|S|Q]: ");
      letter = input.next().charAt(0);
      
      switch(letter)
      {
         case 'A':
         case 'a':
            System.out.println("OPTION A - ADD");
            System.out.println("ENTER FIRST NUMBER");
            num1 = input.nextInt();
            System.out.println("ENTER SECOND NUMBER");
            num2 = input.nextInt();
            total = num1 + num2;
            break;
         case 'S':
         case 's':
            System.out.println("OPTION S - SUBTRACT");
            System.out.println("ENTER FIRST NUMBER");
            num1 = input.nextInt();
            System.out.println("ENTER SECOND NUMBER");
            num2 = input.nextInt();
            total = num1 - num2;
            break;
         case 'Q':
         case 'q':
            System.out.println("EXITING THE CALCULATION");
            break;
         default:
            System.out.println("INVALID OPTION");
            break;
      }
   } while (letter != 'Q' && letter != 'q');

   System.out.println("Answer: " + total);
   }
}