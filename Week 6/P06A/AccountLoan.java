/* Practical P06A- Question 2
Eryk Gloginski
10/11/2020
Program to check loan account type and calculate total repayment to be expected*/

import java.util.Scanner;

public class AccountLoan
{
   public static void main(String [] args)
   {
   
   // construct scanner
   Scanner input = new Scanner(System.in);

   // declare variable
   char loanAccount;
   double loanAmount, interest, totalRepayment, interestAdded;
   
   // prompt for input and take variable
   System.out.println("Enter the amount you would like to loan: ");
   loanAmount = input.nextDouble();
   System.out.println("5 types of loans are available: ");
   System.out.println("[A or a], [K or k], [M or m], [P or p], [Z or z] ");
   System.out.println("Which type of loan would you like to choose? ");
   loanAccount = input.next().charAt(0);
   
   
   switch(loanAccount)
   {
      case 'A':
      case 'a':
         interest = .10;
         interestAdded = loanAmount * interest;
         totalRepayment = loanAmount + interestAdded;
         System.out.println("Loan Account Type: " + loanAccount + " | Total Repayment Expected: " + totalRepayment);
         break;
      case 'K':
      case 'k':
         interest = .05;
         interestAdded = loanAmount * interest;
         totalRepayment = loanAmount + interestAdded;
         System.out.println("Loan Account Type: " + loanAccount + " | Total Repayment Expected: " + totalRepayment);
         break;
      case 'M':
      case 'm':
         interest = .04;
         interestAdded = loanAmount * interest;
         totalRepayment = loanAmount + interestAdded;
         System.out.println("Loan Account Type: " + loanAccount + " | Total Repayment Expected: " + totalRepayment);
         break;
      case 'P':
      case 'p':
         interest = .05;
         interestAdded = loanAmount * interest;
         totalRepayment = loanAmount + interestAdded;
         System.out.println("Loan Account Type: " + loanAccount + " | Total Repayment Expected: " + totalRepayment);
         break;
      case 'Z':
      case 'z':
         interest = .10;
         interestAdded = loanAmount * interest;
         totalRepayment = loanAmount + interestAdded;
         System.out.println("Loan Account Type: " + loanAccount + " | Total Repayment Expected: " + totalRepayment);
         break;
      default:
         System.out.println("Invalid Loan Account Type! ");
   }
   }
}