/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author Matthew Hader
 *
 */
public class Rectangle implements Shapes {

	double area;
	double length;
	double width;
	
	public Rectangle(double d, double e) {
		this.length = d;
		this.width = e;
	}
	
	@Override
	public void calculateArea() {
		area = (length * width);		
	}

	@Override
	public void display() {
		try {
			System.out.printf("A rectangle with length %.3f and width %.3f has an area of: %.3f\n", length, width, area);
		}
		catch (Exception e) {
			System.out.println("The area has not been calculated yet");
		}
	}

	
}
