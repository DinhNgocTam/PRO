package lab3A;

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

    public Person() {
    }

    public void scanInfo() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID: ");

        this.id = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name: ");

        this.name = input.nextLine();
        System.out.println("Enter Gender: ");
        this.gender = input.nextBoolean();
    }

    public void printInfo() {
        System.out.println("---------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", this.id, this.name, this.gender);
    }

    @Override
    public String toString() {
        return "Person {" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }

}
