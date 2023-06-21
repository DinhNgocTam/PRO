/*
@author Hi
@date Jun 20, 2023
*/
package edu;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	private String address;
	private float average;
	public Student() {
		
	}
	public Student(String name, int age, String address, float average) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.average = average;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", average=" + average + "]";
	}
	
}
