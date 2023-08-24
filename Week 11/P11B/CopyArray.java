/* Practical P11B- Question 5
Eryk Gloginski
16/12/2020
Program to display home wins, away wins and draws*/

import java.util.Scanner;

public class CopyArray
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   System.out.println("Enter amount of numbers: ");
   int nums = input.nextInt();
   
   int[] initial = new int [nums];
   for (int i = 0; i < initial.length; i++)
   {  
      System.out.println("Enter number: #" + (i + 1));
      initial[i] = input.nextInt();
   }
   
   int[] copy = new int [initial.length];
   int[] reverse = new int [initial.length];
   int[] addTen = new int [initial.length];
   System.out.println();
   for (int i2 = 0; i2 < initial.length; i2++)
   {  
      copy[i2] = initial[i2];
      System.out.print(copy[i2] + " ");
   }
   System.out.println();
   for (int i3 = (initial.length - 1); i3 >= 0; i3--)
   {  
      reverse[i3] = initial[i3];
      System.out.print(reverse[i3] + " ");
   }
   System.out.println();
   for (int i4 = 0; i4 < initial.length; i4++)
   {  
      addTen[i4] = initial[i4] + 10;
      System.out.print(addTen[i4] + " ");
   }
   }
}