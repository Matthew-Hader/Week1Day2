/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author Matthew Hader
 *
 */
public class Circle implements Shapes{

	double area = 0;
	double radius = 0;
	
	public Circle(double d) {
		this.radius = d;
	}
	
	@Override
	public void calculateArea() {
		area = (Math.PI * radius * radius);
	}

	@Override
	public void display() {
		try {
			System.out.printf("A circle with radius %.3f has an area of: %.3f\n", radius, area);
		}
		catch (Exception e) {
			System.out.println("The area has not been calculated yet");
		}
	}

	
}
