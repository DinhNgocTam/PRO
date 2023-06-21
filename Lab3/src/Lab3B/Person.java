package Lab3B;

import java.util.Scanner;

public class Person {

    private int id;
    private String name;
    private boolean gender;

   public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;

    }
    public Person(){
        
    }

    @Override
    public String toString() {
        return "Person {" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }

}
