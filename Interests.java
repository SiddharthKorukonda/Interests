/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 2
   Question 2 (Interests.java)
 */

import java.util.*;

public class Interests {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loan = s.nextDouble();
        System.out.print("Number of years: ");
        int years = s.nextInt();

        System.out.print("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        System.out.println();

        for (double i=5; i<=8; i+=0.125) {
            double monthlyInterestRate = i/1200;
            double monthlyPayment = (double) loan * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));
            double totalPayment = (double) monthlyPayment*years*12;
            System.out.printf("%.3f%%  \t\t\t%.2f  \t\t\t%.2f\n", i, monthlyPayment, totalPayment);
        }
    }
}
