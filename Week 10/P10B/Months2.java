/* Practical P10B- Question 8
Eryk Gloginski
09/12/2020
Program to enter month number and receive feedback with days.*/

import java.util.Scanner;

public class Months2
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
   
   switch (number)
   {
      case 0:
      case 2:
      case 4:
      case 6:
      case 7:
      case 9:
      case 11:
         days = 31;
         break;
      case 1:
         days = 28;
         break;
      case 3:
      case 5:
      case 8:
      case 10:
         days = 30;
         break;    
   }
   
   // DISPLAY
   System.out.println("That month is " + months[number]);
   System.out.println(months[number] + " has " + days + " days");
   }
}