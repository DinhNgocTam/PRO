/*
@author Hi
@date Sep 13, 2023
*/
package controller;

import common.Library;
import view.Menu;

public class ChangeNumber extends Menu<String>{
	static String[] mc = {"Binary", "Decimal", "Hexadecimal"};
	Library library = new Library();
	
	
	
	public void exitProgram() {
		System.out.println("1.Exit");
		System.out.println("2.Continue");
		int choice = library.getInteger("Enter your choice: ");
		switch (choice) {
		case 1: 
			System.out.println("Program stop");
			System.exit(0);
		case 2:
		
		}
	}

	public ChangeNumber() {
		super("Title", mc);
	}
	@Override
	public void executed(int n, int m) {
		int choiceSwitchCase = -1;
		if(n == 1 && m == 2) { // Binary to Decimal
			choiceSwitchCase = 1;
		}else if(n == 2 && m == 1) { // Decimal to Binary
			choiceSwitchCase = 2;
		}else if(n == 3 && m == 2) { // Hexadecimal to Decimal
			choiceSwitchCase = 3;
		}else if(n == 2 && m == 3) { //Decimal to Hexadecimal
			choiceSwitchCase = 4;
		}else {
			System.out.println("Invalid");
			
		}
		
		switch (choiceSwitchCase) {
		case 1: 
			String num1 = library.getValue("Input binary: ");
			System.out.println(library.binaryToDecimal(num1));
			exitProgram();
			break;
		case 2:
			int num2 = library.getInteger("Input decimal: ");
			System.out.println(library.decimalToBinary(num2));
			exitProgram();
			break;
		case 3:
			String num3 = library.getValue("Input hexadecimal: ");
			System.out.println(library.hexaToDecimal(num3));
			exitProgram();
			break;
		case 4:
			int num4 = library.getInteger("Input decimal: ");
			System.out.println(library.decimalToHexa(num4));
			exitProgram();
			break;
		default:
			System.out.println("Try again");
			break;
		}
		
	}
}

