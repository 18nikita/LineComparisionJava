package com.LineComparision;

public class LengthCalculate {

	public static void main(String[] args) {
		// UC-1-Calculate Length of Line Using Cartesian coordinate system
		
		//Constants
		double x1=2;
		double y1=4;
		double x2=6;
		double y2=8;
		{       
		   double dist= Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		System.out.println("The Length of Line = " + "" + dist);
	}
}
}