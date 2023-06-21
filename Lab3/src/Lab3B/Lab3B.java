package Lab3B;

import java.util.Scanner;

public class Lab3B {

    public static void main(String[] args) {
        Person p = new Person();
        p = scanInfo();
        printInfo(p);
    }

    
    public static Person scanInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID: ");

        int id = input.nextInt();
        input.nextLine();
        //p.setId(id);
        System.out.println("Enter Name: ");
        String name = input.nextLine();

        System.out.println("Enter Gender: ");
        boolean gender = input.nextBoolean();
        return new Person(id, name, gender);
    }

    public static void printInfo(Person p) {
        System.out.println("---------------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\n", p.getId(), p.getName(), p.getGender());
    }

}
