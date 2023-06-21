/*
@author Hi
@date Jun 20, 2023
*/
package edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestFile {
	public static void testLuuFile() {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student("Nguyen Van An", 20, "DN", 7.0f));
		stdList.add(new Student("Nguyen Van Binh", 30, "DN", 8.0f));
		stdList.add(new Student("Nguyen Van Hanh", 40, "DN", 9.0f));
		stdList.add(new Student("Nguyen Van Phuc", 50, "DN", 6.0f));
		boolean kq = FileIO.luuFile(stdList, "C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student1.txt");
		if (kq == true) {
			System.out.println("Luu file thanh cong");
		} else {
			System.out.println("Luu file that bai");
		}
	}

	public static void testreadFile() {
		try {
			File myObj = new File("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student1.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Da xay ra loi.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testLuuFile();
	}

}
