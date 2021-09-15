/**
 * 
 */
package com.ss.basics.addargs;

/**
 * @author Matthew Hader
 *
 */
public class AddArguments {

	
	public static void main(String[] args) {
		Double sum = 0.0;
		String nonNumArgs = "";
		for(String a : args) {
			try {
				sum += Double.parseDouble(a);
			} 
			catch (Exception e) {
				nonNumArgs = nonNumArgs.concat(a);
			}
		}
		System.out.printf("sum of args that were numbers: %f\n", sum);
		System.out.println("sum of args that were not numbers: " + nonNumArgs);

	}

}
