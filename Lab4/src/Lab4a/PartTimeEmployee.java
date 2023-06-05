/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4a;

/**
 *
 * @author PC
 */
public class PartTimeEmployee extends Employee {

    private final double SEASONALDISCOUNTRATE = 0.5;

    public PartTimeEmployee(int id, String firstName, String lastName, int age, int birthday, int dayWork) {
        super(id, firstName, lastName, age, birthday, dayWork);
    }

    public double salary() {
        return this.dayWork * 1000000 * this.SEASONALDISCOUNTRATE;
    }

    public double getSEASONALDISCOUNTRATE() {
        return SEASONALDISCOUNTRATE;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.getId() + ", first name=" + this.getFirstName() + ", last name=" + this.getLastName() + ", age=" + this.getAge() + ", birthday=" + this.getBirthday() + ", dayWork=" + this.getDayWork() + ", Seasonal discount trate=" + this.getSEASONALDISCOUNTRATE()
                + '}';
    }
}
