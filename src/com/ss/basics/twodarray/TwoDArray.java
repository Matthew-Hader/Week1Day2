/**
 * 
 */
package com.ss.basics.twodarray;

import java.util.Random;

/**
 * @author Matthew Hader
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare variables
		int arrayMax = 0;
		int maxRow = -1;
		int maxColumn = -1;
		int[][] sampleArray = new int[5][5];
		Random random = new Random();
		
		//Generate 2D Array with random positive numbers
		for(int i = 0; i < sampleArray.length; i++) {
			for(int j = 0; j < sampleArray[i].length; j++) {
				sampleArray[i][j] = (random.nextInt((100 - 1) + 1) + 1);
				System.out.printf("%3d ", sampleArray[i][j]);
			}
			System.out.print("\n");
		}
		
		//Find largest number (and it's location)
		for(int i = 0; i < sampleArray.length; i++) {
			for(int j = 0; j < sampleArray[i].length; j++) {
				if(sampleArray[i][j] > arrayMax) {
					arrayMax = sampleArray[i][j];
					maxRow = i + 1;
					maxColumn = j + 1;
				}
			}
		}
		System.out.printf("\nArray Max: %d \nColumn: %d \nRow:    %d", arrayMax, maxColumn, maxRow);

	}

}
