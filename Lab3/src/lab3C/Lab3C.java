package lab3C;

import java.util.Scanner;
import Lab3B.Person;

public class Lab3C {

    public static void main(String[] args) {
        Person p = new Person();

        Person p1 = new Person(2, "Tam Dinh", true);
        Person p2 = new Person(2, "Tam Dinh", true);

        Person[] perArr = new Person[4];
        perArr[0] = p1;
        perArr[1] = p2;
        for (int i = 2; i < perArr.length; i++) {
            perArr[i] = scanInfo();
        }

        for (int i = 0; i < 4; i++) {
            printInfo(perArr[i]);
        }

    }

    public static Person scanInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID: ");

        int id = input.nextInt();
        input.nextLine();

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
