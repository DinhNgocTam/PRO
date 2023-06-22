/*
@author Hi
@date Jun 20, 2023
*/
package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileIO {
	public static boolean luuFile(ArrayList<Student> stdList, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Student t : stdList) {
				String line = t.getName() + ";" + t.getAge() + ";" + t.getAddress() + ";" + t.getAverage();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
