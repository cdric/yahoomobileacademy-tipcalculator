package com.yahoo.mobileacademy.tipcalculator;

/*
 * Uility class to manage method relation to tip computation
 */
public class TipCalculatorHelper {

	/**
	 * Calculate a tip base on the amount of the bill and a given tip percentage
	 * 
	 * @param billAmount the amount of the bill
	 * @param tipPercentage the tip to apply to the bill
	 * @return
	 */
	public static double calculateTip(double billAmount, double tipPercentage) {
		return Double.valueOf(billAmount * (tipPercentage));
	}
}
