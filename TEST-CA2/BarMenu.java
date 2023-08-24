/* CA2 Question 1
Eryk Gloginski
BSc Computing
10/12/2020
Bar menu program CA2 Q1*/

import java.util.Scanner;

public class BarMenu
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variables
   int choice = 0;
   int age;
   final double cokePrice = 2.55;
   final double crispsPrice = 0.95;
   final double beerPrice = 4.22;
   int cokeCounter = 0;
   int crispsCounter = 0;
   int beerCounter = 0;
   double totalPriceCoke, totalPriceCrisps, totalPriceBeer, totalPrice;
   
   // bar menu
   System.out.println("Bar Menu: ");
   System.out.println("1. Coke €2.55");
   System.out.println("2. Crisps €0.95");
   System.out.println("3. Beer €4.22");
   System.out.println("4. Exit");
   
   // do while statement
   do
   {
      System.out.println("Enter your choice: ");
      choice = input.nextInt();
      
      // switch statement
      switch (choice)
      {
      // coke
      case 1:
         cokeCounter++;
         break;
      // crisps
      case 2:
         crispsCounter++;
         break;
      // beer + confirmation of age
      case 3:
         System.out.println("Customer must be 18 or over to order this item. ");
         System.out.println("Enter the customer's age: ");
         age = input.nextInt();
         
         // confirmation of age
         if (age >= 18)
         {
            beerCounter++;
         }
         else
         {
            System.out.println("Customer is not of age therefore item will not be added. ");
         }
         break;
      // exit
      case 4:
         System.out.println("Thank you for ordering! ");
         break;
      // if input = invalid
      default:
         System.out.println("Invalid choice! ");
      }
   }while (choice != 4);
   
   // calc total price
   totalPriceCoke = cokePrice * cokeCounter;
   totalPriceCrisps = crispsPrice * crispsCounter;
   totalPriceBeer = beerPrice * beerCounter;
   totalPrice = totalPriceCoke + totalPriceCrisps + totalPriceBeer;
   
   // display
   System.out.println("Total Bill: €" + totalPrice);
   }
}