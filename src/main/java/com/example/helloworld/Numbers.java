package com.example.helloworld;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
	ArrayList<Double> CurrencyTable = new ArrayList<Double>();
	ArrayList<Double> sortedCurrencyTable = new ArrayList<Double>();
	private double sumOfValues = 0;
	
	public void addValue(double value) {
		CurrencyTable.add(value);
	}
	
	public double getValueFromCurrencyTable(int i) {
		return CurrencyTable.get(i);
	}
	
	public double calculateArithmeticMean() {
		return sumOfValues / CurrencyTable.size();
	}
	
	public double calculateSum() {
		return sumOfValues;
	}
	
	public String viewNumbers() {
		String all = "";
		
		for (int i=0; i<CurrencyTable.size(); i++)
		{
			all += CurrencyTable.get(i);
		}
		return all;
	}
}
