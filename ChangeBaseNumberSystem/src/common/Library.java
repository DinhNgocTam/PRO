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
	
	public int binaryToDecimal(String binary) {
		int result = -1;
		try {
			result = Integer.parseInt(binary,2);
		} catch (Exception e) {
			System.out.println("Enter only binary");
			result =  binaryToDecimal(getValue("Enter binary number: "));
		}
		return result;
	}
	
	public String decimalToBinary(int number) {
		return Integer.toBinaryString(number);
	}
	
	public int hexaToDecimal(String hexa) {
		int result = -1;
		try {
			result = Integer.parseInt(hexa,16);
		} catch (Exception e) {
			System.out.println("Enter only hexadecimal");
			result =  hexaToDecimal(getValue("Enter hexadecimal number: "));
		}
		return result;
	}
	public String decimalToHexa(int number) {
		return Integer.toHexString(number);
	}
}
