package Lab3D;

import Lab3B.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab3D {

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        Person p1 = new Person(2, "Tam", true);
        Person p2 = new Person(8, "Ngoc", true);
        person.add(p1);
        person.add(p2);

        Person p3 = new Person();
        Person p4 = new Person();
        p3 = scanInfo();
        person.add(p3);
        p4 = scanInfo();
        person.add(p4);

        for (Person person1 : person) {
            System.out.println(person1);
        }

        System.out.println("After sort");
        sortArrayList(person);

        for (Person person2 : person) {
            System.out.println(person2);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of person you want to search: ");
        String name = sc.nextLine();
        searchStudent(name, person);
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

    public static void sortArrayList(ArrayList<Person> person) {
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person per1, Person per2) {
                return per1.getName().compareTo(per2.getName());

            }

        });
    }

    public static void searchStudent(String name, ArrayList<Person> person) {
        int check = 0;
        for (Person person1 : person) {
            if (person1.getName().indexOf(name) >= 0) {
                System.out.println(person1);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Don't have this student in this list");
        }
    }
}
