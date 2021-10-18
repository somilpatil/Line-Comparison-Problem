package com.bl;

public class LineComparison {
	public static void main(String[] args) {
		double x1 = 1 ;
		double x2 = 2 ;
		double y1 = 3 ;
		double y2 = 4 ;
		double Distance;
   
		Distance = Math.sqrt(Math.pow(x2 - x1, 2))+(Math.pow(y2-y1,2)); 
		System.out.println("The lenght of line is :" +Distance);
	}
}
