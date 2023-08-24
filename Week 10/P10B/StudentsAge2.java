/* Practical P10B- Question 6
Eryk Gloginski
09/12/2020
Program to enter ages of students and display them.*/

import java.util.Scanner;

public class StudentsAge2
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare vars
   int amountOfPeople;
   System.out.println("Enter amount of students: ");
   amountOfPeople = input.nextInt();
   
   // declare array
   int[] studentAges = new int[amountOfPeople];
   
   // for loop
   for(int count = 0; count < studentAges.length; count++)
   {
      System.out.println("Enter your age student #" + (count + 1) + ": ");
      studentAges[count] = input.nextInt();
   }
   for(int count2 = 0; count2 < studentAges.length; count2++)
   {
      System.out.println("Student #" + (count2 + 1) + "'s age: " + studentAges[count2]);
   }
   }
}