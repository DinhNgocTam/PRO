/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4b;

import Lab4a.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class PartTimeEmployee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int birthday;
    private int dayWork;
    private final double SEASONALDISCOUNTRATE = 0.5;
    private double salary;
    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
    public PartTimeEmployee(int id, String firstName, String lastName, int age, int birthday, int dayWork) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.dayWork = dayWork;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "id=" + id + ", first name=" + firstName + ", last name=" + lastName + ", age=" + age + ", birthday=" + birthday + ", dayWork=" + dayWork + ", SEASONALDISCOUNTRATE=" + SEASONALDISCOUNTRATE + ", salary=" + numf.format(this.getSalary()) + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }

    

    public double getSalary() {
        return (this.dayWork * 1000000 * this.SEASONALDISCOUNTRATE);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    

    public PartTimeEmployee(String name) {
        this.firstName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartTimeEmployee other = (PartTimeEmployee) obj;
        return Objects.equals(this.firstName, other.firstName);
    }

}
