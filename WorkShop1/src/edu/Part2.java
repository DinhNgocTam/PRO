/*
@author Hi
@date May 13, 2023
*/
package edu;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		float num1, num2;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input the number 1: ");
			num1 = sc.nextFloat();
			System.out.println("Input the number 2: ");
			num2 = sc.nextFloat();
			sc.nextLine();
			String op;
			System.out.println("Input the operator(+-*/): ");
			op = sc.nextLine();

			switch (op) {
			case "+":
				System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				
				System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
				break;
			default:
				System.out.println("Invalid operator");
			}
		}
	}

	
}




