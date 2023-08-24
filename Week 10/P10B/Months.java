/* Practical P10B- Question 7
Eryk Gloginski
09/12/2020
Program to enter month number.*/

import java.util.Scanner;

public class Months
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare vars
   int number;
   int days = 0;
   System.out.println("Enter a month number: ");
   number = input.nextInt();
   number = number - 1;
   // declare array
   String[] months = {"Januray", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   
   // DISPLAY
   System.out.println("That month is " + months[number]);
   }
}