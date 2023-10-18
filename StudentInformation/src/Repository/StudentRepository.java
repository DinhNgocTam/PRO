/*
@author Hi
@date Oct 18, 2023
*/
package Repository;

import java.util.ArrayList;

import dataAccess.StudentManagementDao;
import model.Student;

public class StudentRepository implements IStudentRepository{

	
	@Override
	public void addStudent(ArrayList<Student> ls) {
		StudentManagementDao.Instance().addStudent(ls);
		
	}

	@Override
	public void displayListStudent(ArrayList<Student> ls) {
		StudentManagementDao.Instance().displayListStudent(ls);
		
	}

	@Override
	public void display(ArrayList<Student> ls) {
		StudentManagementDao.Instance().display(ls);
		
	}
	
	
}
