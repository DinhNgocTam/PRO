/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.Company;
import java.util.Scanner;
import model.Customer;

/**
 *
 *
 * @author PC
 */
public class CompanyManagement {

    /**
     * @param args the command line arguments
     */
    Company cusList = new Company();
    Scanner sc = new Scanner(System.in);

    public void listAllCustomer() {
        System.out.println("List of Customers");
        System.out.println("-------------------------");
        cusList.printCustomer();
    }

    public void searchCustomer() {
        System.out.println("Customer Searching");
        System.out.println("-------------------");
        System.out.println("1.Find by Customer ID");
        System.out.println("2.Find by Name");
        System.out.println("3.Find by Customer Number Phone");
        System.out.println("-------------------");
        int temp1;
        do {
            System.out.print("Enter selection : ");
            temp1 = sc.nextInt();
        } while (temp1 != 1 && temp1 != 2 && temp1 != 3);
        sc.nextLine();
        if (temp1 == 1) {
            System.out.print("Enter Id of Customer: ");
            int id = sc.nextInt();
            cusList.searchById(id);
        } else if (temp1 == 2) {
            System.out.print("Enter Name of Customer: ");
            String name = sc.nextLine();
            cusList.searchByName(name);
        } else if (temp1 == 3) {
            System.out.print("Enter Phone of Custosmer: ");
            String phone = sc.nextLine();
            cusList.searchByPhone(phone);
        }
    }

    public void addNewCustomer() {
//        int customerID;
//        do {
//            System.out.print("Enter Customer ID: ");
//            customerID = sc.nextInt();
//        } while (customerID < 0);
//        sc.nextLine();
//        System.out.print("Enter Customer's Name : ");
//        String name = sc.nextLine();
//        System.out.print("Enter Customer's Phone : ");
//        String phone = sc.nextLine();
//        Customer customer = new Customer(customerID, name, phone);
//        cusList.addCustomer(customer);
        Customer cus1 = new Customer(12, "Tam Ngoc", "03265554");
        Customer cus2 = new Customer(10, "Aam Nguyen", "03265554");
        Customer cus3 = new Customer(20, "Bam Ngoc", "070265554");
        Customer cus4 = new Customer(19, "Pam Ngoc", "070265554");
        cusList.addCustomer(cus1);
        cusList.addCustomer(cus2);
        cusList.addCustomer(cus3);
        cusList.addCustomer(cus4);
    }

    public void sortCustomer() {
        sc.nextLine();
        System.out.println("Do you want to sort by name or sort by customer ID");
        String temp2 = sc.nextLine();

        switch (temp2.toLowerCase()) {
            case "name":
                cusList.sortByName();
                System.out.println("List sorted successfully");
                break;
            case "id":
                cusList.sortById();
                System.out.println("List sorted successfully");
                break;
        }
    }

    public void customerStatistical() {
        int temp;
        do {
            System.out.println("What home metwork you want to statistical");
            System.out.println("1. Viettel");
            System.out.println("2. MobiFone");
            System.out.print("Input your choice : ");
            temp = sc.nextInt();
        } while (temp != 1 && temp != 2);
        if (temp == 1) {
            cusList.statisticalByPhoneViettel();
        } else if (temp == 2) {
            cusList.statisticalByPhoneMobile();
        }
    }
}
