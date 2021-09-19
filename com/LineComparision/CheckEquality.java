package com.LineComparision;

public class CheckEquality {

	// UC-2-Check Equality of two lines
	//Coordinates of 1st line
	static double x1=2;
	static double y1=4;
	static double x2=6;
	static double y2=8;
	
	// coordinates of second line
	static double x3=5;
	static double y3=3;
	static double x4=7;
	static double y4=9;


	public static void main(String[] args) {
		
	double dist1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));	
			System.out.println("The length of 1st line is "+ "" + dist1);
			
	double dist2 = Math.sqrt((y4 - y3) * (y4 - y3) + (x4 - x3) * (x4 - x3));
	System.out.println("The length of 2nd line is "+ "" + dist2);	
		
	if(dist1 == dist2) {
		System.out.println("Two lines are equal");
	}
	else {
		System.out.println("Two lines are unequal");
	}
}
}	

