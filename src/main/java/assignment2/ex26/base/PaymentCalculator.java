/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Saini
 */

package assignment2.ex26.base;
import java.lang.Math;

public class PaymentCalculator {

    // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public double  calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayment)
    {
        APR /= 100;
        double i = APR/365;
        double n = (Math.log(1 + balance/monthlyPayment * (1-Math.pow((1+i), 30))));
        return Math.rint(n);
    }

}
