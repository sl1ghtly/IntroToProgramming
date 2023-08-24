/* Practical P07B- Question 1
Eryk Gloginski
18/11/2020
Program to terminate when user puts inputs 0.*/

import java.util.Scanner;

public class AskNumberZero
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int num;
   
   System.out.println("Enter number 0.");
   num = input.nextInt();
   
   while (num != 0)
   {
      System.out.println("Not number 0. Enter number 0.");
      num = input.nextInt();
   }
   System.out.println("Well done, you entered 0!");
   }
}