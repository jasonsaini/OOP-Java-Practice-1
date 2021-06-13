/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */
package assignment2.ex26.base;
import java.util.Scanner;


public class Solution26 {
    public static void main(String args[])
    {
        PaymentCalculator calculator = new PaymentCalculator();
        Scanner in = new Scanner(System.in);
        double numMonths;
        double balance, APR, minMonthlyPayment;

        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card as a percent? ");
        APR = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        minMonthlyPayment = in.nextDouble();

        numMonths  = calculator.calculateMonthsUntilPaidOff(APR, balance,minMonthlyPayment);

        System.out.print("It will take you " + numMonths + " months to pay off this card.");
    }

}
