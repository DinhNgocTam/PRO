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
public class OfficialEmployee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int birthday;
    private int dayWork;
    private int OThours;
    private double salary;

    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public OfficialEmployee(int id, String firstName, String lastName, int age, int birthday, int dayWork, int OThours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.dayWork = dayWork;
        this.OThours = OThours;
        this.salary = salary;
    }

    public int getOThours() {
        return OThours;
    }

    public void setOThours(int OThours) {
        this.OThours = OThours;
    }

    public double getSalary() {
        return (this.dayWork * 1000000 + this.OThours * 100000);
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

    @Override
    public String toString() {
        return "OfficialEmployee{" + "id=" + id + ", first Name=" + firstName + ", last Name=" + lastName + ", age=" + age + ", birthday=" + birthday + ", dayWork=" + dayWork + ", OThours=" + OThours + ", salary=" + numf.format(this.getSalary()) + '}';
    }

    public OfficialEmployee(String name) {
        this.lastName = name;
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
        final OfficialEmployee other = (OfficialEmployee) obj;
        return Objects.equals(this.lastName, other.lastName);
    }

}
