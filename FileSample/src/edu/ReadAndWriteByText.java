/*
@author Hi
@date Jun 21, 2023
*/
package edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;

public class ReadAndWriteByText {
	public static void writeData() {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student4.txt");
			pw.println("Dinh Ngoc Tam - DE170505");
			pw.println("SE17D05");
			pw.flush();
			pw.close();
		} catch (Exception e) {
			System.out.println("Error! An error occurred.");
		}
	}
	
	public static void readData() {
		try {
			File file = new File("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student4.txt");
			BufferedReader br = Files.newBufferedReader(file.toPath());
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		ReadAndWriteByText.writeData();
		ReadAndWriteByText.readData();
	}
}
