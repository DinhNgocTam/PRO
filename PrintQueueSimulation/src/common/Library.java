/*
@author Hi
@date Aug 30, 2023
*/
package common;

import java.util.Random;
import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);

	public String getValue(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	public int getIntForMenu(String msg, int m, int n) {
		int a = -1;
		while (true) {
			System.out.print(msg);
			try {
				a = Integer.parseInt(sc.nextLine());
				if (a >= m && a <= n) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Please enter a number between " + m + " and " + n);
			}
		}
		return a;
	}

	public int getInteger(String msg) {
		int a = -1;
		while (true) {
			System.out.println(msg);
			try {
				a = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Only input number");
				continue;
			}
			break;
		}
		return a;
	}

	public int[] autoCreateArray(int size_Array) {
		int[] array = new int[size_Array];
		Random random = new Random();
		for (int i = 0; i < size_Array; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}

	public void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i < array.length - 1 ? array[i] + ", " : array[i]);
		}
		System.out.println();
	}
}
