/* Practical P10B- Question 3
Eryk Gloginski
09/12/2020
PSEUDOCODE PROGRAM*/

/*

GET amountOfPeople

DECLARE ARRAY SIZE OF amountOfPeople

FOR i = 0; i < Length of amountOfPeople; i++;
   GET studentName

FOR i2 = 0; i2 < Length of amountOfPeople; i2++;
   DISPLAY studentNames
   
*/

import java.util.Scanner;

public class StudentNames
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
   String[] studentNames = new String[amountOfPeople];
   
   // for loop
   for(int count = 0; count < studentNames.length; count++)
   {
      System.out.println("Enter student name #" + count + ": ");
      studentNames[count] = input.nextLine();
   }
   for(int count2 = 0; count2 < studentNames.length; count2++)
   {
      System.out.println(studentNames[count2]);
   }
   
   }
}