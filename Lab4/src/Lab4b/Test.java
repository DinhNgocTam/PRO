/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4b;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeListOE OEL = new EmployeeListOE();
        EmployeeListPE PEL = new EmployeeListPE();
        int choice;
        do {
            System.out.println("---------------------------Menu-----------------------------");
            System.out.println("1. Enter employee list from keyboard");
            System.out.println("2. Export the List by employee type to the screen");
            System.out.println("3. Sort descending by salary and output to the screen");
            System.out.println("4. Find and delete employees by name entered from the keyboard");
            System.out.println("5. Export the average salary of each type of employee");
            System.out.println("Press 0 to END program");
            System.out.print("Press your choice here: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Choose type of employee you want to input:");
                    System.out.println("Press 1: Official Employee\nPress 2: Part time Employee ");
                    System.out.print("Input your choice: ");
                    int temp1 = sc.nextInt();
                    if (temp1 == 1) {
                        System.out.println("Enter id of employee: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter first name of employee: ");
                        String firstName = sc.nextLine();
                        System.out.println("Enter last name of employee: ");
                        String lastName = sc.nextLine();
                        System.out.println("Enter age of employee: ");
                        int age = sc.nextInt();
                        System.out.println("Enter birthday of employee: ");
                        int birthday = sc.nextInt();
                        System.out.println("Enter number day work of employee: ");
                        int dayWork = sc.nextInt();
                        System.out.println("Enter OT hours of employee: ");
                        int otHours = sc.nextInt();

                        OfficialEmployee oEmployee = new OfficialEmployee(id, firstName, lastName, age, birthday, dayWork, otHours);
                        OEL.addEmployeeList1(oEmployee);
                    } else {
                        System.out.println("Enter id of employee: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter first name of employee: ");
                        String firstName = sc.nextLine();
                        System.out.println("Enter last name of employee: ");
                        String lastName = sc.nextLine();
                        System.out.println("Enter age of employee: ");
                        int age = sc.nextInt();
                        System.out.println("Enter birthday of employee: ");
                        int birthday = sc.nextInt();
                        System.out.println("Enter number day work of employee: ");
                        int dayWork = sc.nextInt();


                        PartTimeEmployee pEmployee = new PartTimeEmployee(id, firstName, lastName, age, birthday, dayWork);
                        PEL.addEmployeeList2(pEmployee);

                    }

                    break;
                case 2:
                    OEL.printEmployeeList();
                    PEL.printEmployeeList();
                    break;

                case 3:
                    OEL.sortList();
                    PEL.sortList();
                    System.out.println("Sort succesful");
                    OEL.printEmployeeList();
                    PEL.printEmployeeList();
                    break;
                case 4:
                    System.out.print("Enter the employee's name you want to remove: ");
                    String name = sc.nextLine();
                    System.out.print("This employee is Offical or Parttime. Official is 1 and Part-time is 2 : ");
                    int temp2 = sc.nextInt();
                    if (temp2 == 1) {
                        OfficialEmployee oempRemove = new OfficialEmployee(name);
                        System.out.println(OEL.removeEmployee(oempRemove) == true ? "This employee was remove" : "Don't have this employee in list, please check again");
                    } else {
                        PartTimeEmployee pempRemove = new PartTimeEmployee(name);
                        System.out.println(PEL.removeEmployee(pempRemove) == true ? "This employee was remove" : "Don't have this employee in list, please check again");
                    }
                    break;
                case 5:
                    System.out.println("Average salary of official employee : " + OEL.averagesalary());
                    System.out.println("Average salary of part-time employee :  " + PEL.averagesalary());
                    break;
                case 0:
                    System.out.println("Thanks for using my Employee management app");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }

}
