/* Practical P07B- Question 2
Eryk Gloginski
18/11/2020
Program to terminate when user puts inputs 0 and add total of all values entered.*/

import java.util.Scanner;

public class AskNumberZero2
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   int total = 0;
   
   System.out.println("Enter number 0.");
   num = input.nextInt();
   total = num + total;
   
   while (num != 0)
   {
      System.out.println("Not number 0. Enter number 0.");
      num = input.nextInt();
      total = num + total;
   }
   System.out.println("Well done, you entered 0!");
   System.out.println("Total Value: " + total);
   }
}