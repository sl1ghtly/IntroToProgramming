/* Practical P11A- Question 2
Eryk Gloginski
15/12/2020
Program to search for valid value*/

import java.util.Scanner;

public class LottoNumbers
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   int searchValue = 0;
   int position = -1;
   
   // get array size
   System.out.println("Enter amount of numbers: ");
   int size = input.nextInt();
   
   // declare array
   int[] numbers = new int[size];
   // for loop
   for(int count = 0; count < numbers.length; count++)
   {
      System.out.println("Enter number #" + (count + 1) +": ");
      numbers[count] = input.nextInt();
   }
   
   System.out.print("Enter the value to search for: ");
   searchValue = input.nextInt();
   
   for(int count2 = 0; count2 < numbers.length; count2++)
   {
      if (numbers[count2] == searchValue)
      {
         position = count2;
      }
   }
   
   if (position != -1)
   {
      System.out.print("Lotto Number Position Found: " + position);
   }
   else
   {
      System.out.print("Lotto Number NOT found ");
   }
   }
}