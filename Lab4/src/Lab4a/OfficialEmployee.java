/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4a;

import java.text.DecimalFormat;

/**
 *
 * @author PC
 */
public class OfficialEmployee extends Employee {

    private int OThours;

    public OfficialEmployee(int id, String firstName,String lastName, int age, int birthday, int dayWork, int OThours) {
        super(id, firstName,lastName, age, birthday, dayWork);
        this.OThours = OThours;
    }

    public double salary() {
        return this.dayWork * 1000000 + this.OThours * 100000;
    }

    public int getOThours() {
        return OThours;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.getId() + ", first name=" + this.getFirstName()+", last name=" + this.getLastName() + ", age=" + this.getAge() + ", birthday=" + this.getBirthday() + ", dayWork=" + this.getDayWork() + ", OT hours=" + this.getOThours()
    

 + '}';
    }

    
    


    

}
