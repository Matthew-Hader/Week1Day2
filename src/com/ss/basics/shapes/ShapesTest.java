/**
 * 
 */
package com.ss.basics.shapes;

/**
 * @author Matthew Hader
 *
 */
public class ShapesTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3.5, 5.5);
		Circle cir = new Circle(3.5);
		Triangle tri = new Triangle(3.5, 5.5);
		
		rect.calculateArea();
		cir.calculateArea();
		tri.calculateArea();
		
		rect.display();
		cir.display();
		tri.display();
	}

}
