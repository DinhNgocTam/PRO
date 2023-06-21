/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menu {
    public void menuForUser(){
        Scanner sc = new Scanner(System.in);
        CompanyManagement companyManagement = new CompanyManagement();
        int choice;
        do {            
            System.out.println("Company Management System");
            System.out.println("--------------------------------");
            System.out.println("1.List all customer");
            System.out.println("2.Search customer");
            System.out.println("3.Add new Customer");
            System.out.println("4.Sort Customer");
            System.out.println("5.Customer Statistical");
            System.out.println("6.Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter selection: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    companyManagement.listAllCustomer();
                    break;
                case 2:
                    companyManagement.searchCustomer();
                    break;
                case 3:
                    companyManagement.addNewCustomer();
                    break;
                case 4:
                    companyManagement.sortCustomer();
                    break;
                case 5:
                    companyManagement.customerStatistical();
                    break;
                case 6:
                    System.out.println("Thanks for using my program");
                    break;
                default:
                   System.out.println("Please try again");
                   break;
            }
        } while (choice != 6);
    }
}
