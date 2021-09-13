/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class App 
{
    static final double TAX_PERCENT = 0.055;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print( "What is the order amount? ");
        String strOrder = scan.nextLine();
        System.out.print( "What is the state? ");
        String strState = scan.nextLine();

        //processing
        double order = Double.parseDouble(strOrder);
        if(strState.equals("WI"))
        {
            double tax = order * TAX_PERCENT;
            double total = order + (order * TAX_PERCENT);

            BigDecimal formatTax = new BigDecimal(tax).setScale(2, RoundingMode.HALF_UP);
            NumberFormat dTax = NumberFormat.getCurrencyInstance();

            BigDecimal formatTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            NumberFormat dFormat = NumberFormat.getCurrencyInstance();

            System.out.println("The subtotal is " +dFormat.format(order)+ "\n" + "The tax is " +dTax.format(formatTax)+ ".\n" + "The total is " +dFormat.format(formatTotal)+ "." );
            return;
        }
        BigDecimal formatTotal = new BigDecimal(order).setScale(2, RoundingMode.HALF_UP);
        NumberFormat dFormat = NumberFormat.getCurrencyInstance();
        System.out.println("The total is " +dFormat.format(formatTotal));

    }
}
