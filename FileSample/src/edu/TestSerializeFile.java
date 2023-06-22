/*
@author Hi
@date Jun 20, 2023
*/
package edu;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class TestSerializeFile {
	public static void testSaveSerializeFile() {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student("Nguyen Van An", 20, "DN", 7.0f));
		stdList.add(new Student("Nguyen Van Binh", 30, "DN", 8.0f));
		stdList.add(new Student("Nguyen Van Hanh", 40, "DN", 9.0f));
		stdList.add(new Student("Nguyen Van Phuc", 50, "DN", 6.0f));
		boolean kq = SerializeFiloIO.SaveFile(stdList, "C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student3.txt");
		if (kq == true) {
			System.out.println("Luu file thanh cong");
		} else {
			System.out.println("Luu file that bai");
		}
	}

	public static Object testReadFile() {

		try {

			FileInputStream fileIn = new FileInputStream("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student3.txt");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			Object obj = objectIn.readObject();

			objectIn.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		 testSaveSerializeFile();
		ArrayList<Student> stdList = (ArrayList<Student>) testReadFile();
		for (Student student : stdList) {
			System.out.println(student);
		}
	}
}
