/*
@author Hi
@date May 13, 2023
*/
package edu;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		int rows, columns;
		
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("Enter number of rows: ");
				rows = sc.nextInt();
				System.out.println("Enter number of columns: ");
				columns = sc.nextInt();
				if (rows <= 0 || columns <= 0) {
					System.out.println("Enter number of rows and columns bigger than 0");
				}
			} while (rows <= 0 || columns <= 0);

			int[][] matrix = new int[rows][columns];

			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < columns; j++) {
					
					System.out.print("matrix[" + i + "]" + "[" + j + "]= ");
					matrix[i][j] = sc.nextInt();
					

				}
			}
			System.out.println("Matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.print("\n");
			}
			

			int sum = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					sum += matrix[i][j];
				}
			}
			System.out.println("Sum of elements in matrix: " + sum);
			System.out.println("Average of elements in matrix: " + (float) sum / (rows * columns));
		}
	}

}
