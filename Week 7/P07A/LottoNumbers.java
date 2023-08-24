/* Practical P07A- Question 3
Eryk Gloginski
17/11/2020
Program to terminate when you submit your lotto numbers.*/

import java.util.Scanner;

public class LottoNumbers
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int lotto1, lotto2, lotto3;
   char newNumbers;
   
   System.out.println("Enter your first lotto number: ");
   lotto1 = input.nextInt();
   System.out.println("Enter your second lotto number: ");
   lotto2 = input.nextInt();
   System.out.println("Enter your third lotto number: ");
   lotto3 = input.nextInt();
   
   System.out.println("Do you wish to select new different numbers? ");
   newNumbers = input.next().charAt(0);
   
   while (newNumbers == 'y' || newNumbers == 'Y')
   {
      System.out.println("Enter your first lotto number: ");
      lotto1 = input.nextInt();
      System.out.println("Enter your second lotto number: ");
      lotto2 = input.nextInt();
      System.out.println("Enter your third lotto number: ");
      lotto3 = input.nextInt();
      break;
   }
   
   System.out.println("Your lotto numbers are: " + lotto1 + " | " + lotto2 + " | " + lotto3 );
   }
}