package com.yahoo.mobileacademy.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Activity Class for the TipCalculator App
 * @author CŽdric Lignier <cedric.lignier@free.fr>
 *
 */
public class TipCalculatorActivity extends Activity {

	// The EditText that contain the amount of the bill
	private EditText etBillAmount;
	
	// The TextView that display the amount of the tip
	private TextView tvTipAmount;
	    	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        
        etBillAmount = (EditText) findViewById(R.id.etBillAmount);
        tvTipAmount = (TextView) findViewById(R.id.tvTipAmount);
    }


    /**
     * On Click event that compute the tip amount
     * based on the amount of the bill entered
     * @param v any of the three tip amount Button
     */
    public void onTipButtonClick(View v) {
    	
    	int billAmount = 0;
    	
    	try {
    	   billAmount = Integer.parseInt(etBillAmount.getText().toString());
    	} catch (NumberFormatException nfe) { }
    	
    	double tipPercentage = 0;
    	if (v.getId() == R.id.btnTenPercentTip) {
    		tipPercentage = .10;
    	}
    	if (v.getId() == R.id.btnFifteenPercentTip) {
    		tipPercentage = .15;
    	}
    	if (v.getId() == R.id.btnTwentyPercentTip) {
    		tipPercentage = .20;
    	}
    	
    	double tipAmount = TipCalculatorHelper.calculateTip(billAmount, tipPercentage);
    	
    	// Format the tip to be display to the user
    	if (tipAmount >0) {
	    	tvTipAmount.setText(R.string.tip_amount_empty);
	    	tvTipAmount.append(" $" + String.format("%.2f", tipAmount));
    	} else {
    		tvTipAmount.setText(R.string.invalid_tip_amount);
    	}
    	
    }
    
}
