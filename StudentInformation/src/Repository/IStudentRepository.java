/*
@author Hi
@date Oct 18, 2023
*/
package Repository;

import java.util.ArrayList;


import model.Student;

public interface IStudentRepository {
	void addStudent(ArrayList<Student> ls);
	
	void displayListStudent(ArrayList<Student> ls);
	void display(ArrayList<Student> ls);
}
