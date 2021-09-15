/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author Matthew Hader
 *
 */
public class Triangle implements Shapes{

	double area = 0;
	double base = 0;
	double height = 0;
	
	public Triangle(double d, double e) {
		this.base = d;
		this.height = e;
	}
	
	@Override
	public void calculateArea() {
		area = (0.5 * base * height);
	}

	@Override
	public void display() {
		try {
			System.out.printf("A triangle with base %.3f and height %.3f has an area of: %.3f\n", base, height, area);
		}
		catch (Exception e) {
			System.out.println("The area has not been calculated yet");
		}
	}

	
}
