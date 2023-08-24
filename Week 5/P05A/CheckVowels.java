/* Practical P05A- Question 3
Eryk Gloginski
03/11/2020
Program to check vowels and display a message if it is a vowel*/

import java.util.Scanner;

public class CheckVowels
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char character;
   
   // prompt for input and take variable
   System.out.println("Enter your character: ");
   character = input.next().charAt(0);
   
   // switch statement
   switch(character)
   {
      case 'A': case 'a':
      case 'E': case 'e':
      case 'I': case 'i':
      case 'O': case 'o':
      case 'U': case 'u':
         System.out.println(character + " is a vowel.");
         break;
      default: System.out.print(character + " is NOT a vowel.");
   }
   }
}