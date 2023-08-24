/* Practical P11B- Question 3
Eryk Gloginski
16/12/2020
Program to display numbers of days per month until -1 is entered*/

import java.util.Scanner;

public class NoOfDays
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   int monthNum = 0;
   
   do {
      System.out.println("Enter month number [1 to 12]: [enter -1 to stop]: ");
      monthNum = input.nextInt();
      
      if (monthNum != -1)
      {
         System.out.println(monthsNames[monthNum - 1] + " has " + noOfDays[monthNum -1] + " days.");
      }
   }while (monthNum != -1);
   System.out.println("Goodbye. ");
   }
}