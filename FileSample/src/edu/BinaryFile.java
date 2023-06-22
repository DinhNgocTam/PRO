/*
@author Hi
@date Jun 21, 2023
*/
package edu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
	public static void binaryFileWriter() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student2.txt")) {
            byte[] data = { 65, 66, 67, 68, 69 };
            fileOutputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void binaryFileReader(){
		try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Hi\\eclipse-workspace\\FileSample\\Student2.txt")) {
            int byteRead;
            while ((byteRead = fileInputStream.read()) != -1) {
                System.out.print(byteRead + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		binaryFileWriter();
		
		binaryFileReader();
	}
}
