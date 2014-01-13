package com.yahoo.mobileacademy.tipcalculator;

/**
 * Utility class to handle tip related computation
 * @author CŽdric Lignier <cedric.lignier@free.fr>
 * 
 */
public class TipCalculatorHelper {

	/**
	 * Simple method that calculate a tip base on the amount 
	 * of the bill and a given tip percentage
	 * 
	 * @param billAmount the amount of the bill
	 * @param tipPercentage the tip to apply to the bill
	 * @return Return the amount of the tip 
	 */
	public static double calculateTip(double billAmount, double tipPercentage) {
		return Double.valueOf(billAmount * (tipPercentage));
	}
}
