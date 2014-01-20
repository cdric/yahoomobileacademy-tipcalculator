package com.yahoo.mobileacademy.tipcalculator;

import junit.framework.TestCase;

/**
 * Unit tests for the public methods of the TipCalculatorHelp utility class
 * @author CŽdric Lignier <cedric.lignier@free.fr>
 *
 */
public class TipCalculatorHelperTest extends TestCase {

	public void testCalculateTip() {
		assertEquals("Compute non null tip amount", 12D, TipCalculatorHelper.calculateTip(120D, .10D));
		assertEquals("Compute tip for bill of 0", 0D, TipCalculatorHelper.calculateTip(0D, .10D));
		assertEquals("Compute tip amount with tip of 0", 0D, TipCalculatorHelper.calculateTip(120D, .0D));
		assertEquals("Compute tip amount with tip of 0", 0D, TipCalculatorHelper.calculateTip(120D, .0D));
	}

}
