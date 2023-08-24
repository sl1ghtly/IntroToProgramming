/* Practical P07B- Question 5
Eryk Gloginski
18/11/2020
Program to enter vowels and count them at the end the loop by pressing '.'*/

import java.util.Scanner;

public class CountVowels
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   char vowel;
   int count = 0;
   
   do
   {
      System.out.println("Enter a vowel: 'A', 'E', 'I', 'O', 'U' | Enter '.' to stop.");
      vowel = input.next().charAt(0);
      count++;
   } while (vowel != '.');
   count--;
   System.out.println("Amount of vowels: " + count);
   }
}