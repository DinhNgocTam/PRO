/*
@author Hi
@date May 13, 2023
*/
package edu;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int list;
			do {
				System.out.println("Input the number of list student's names: ");
				list = sc.nextInt();
			} while (list <= 0);
			String[] name = new String[list];
			sc.nextLine();
			System.out.println("Input the list of names: ");
			for (int i = 0; i < list; i++) {
				name[i] = sc.nextLine();

			}
			for (String n : name) {
				System.out.println(n.toUpperCase());
			}
		}

		
	}

}
