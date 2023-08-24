/* Practical P08A- Question 8
Eryk Gloginski
24/11/2020
Program to input amount of students and get their age and average.*/

import java.util.Scanner;

public class StudentNameAverage
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int students, average;
   int age = 0;
   int total = 0;
   
   System.out.println("How many students are in your class: ");
   students = input.nextInt();
   
   // for loop
   for (int count = 1; count <= students; count++)
   {
      System.out.println("Enter student age: ");
      age = input.nextInt();
      total = total + age;
   }
   average = total / students;
   System.out.println("Average age in class is: " + average); 
   }
}