/*
@author Hi
@date Oct 18, 2023
*/
package controller;

import java.util.ArrayList;


import Repository.StudentRepository;
import model.Student;

public class StudentInformation {
	
	public void run() {
		ArrayList<Student> ls = new ArrayList<>();
		new StudentRepository().display(ls);
	}
}
