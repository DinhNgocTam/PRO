/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import model.Customer;

/**
 *
 * @author PC
 */
public class Company {

    List<Customer> cusList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        cusList.add(customer);
    }

    public void printCustomer() {
        for (Customer customer : cusList) {
            System.out.println(customer);
        }
        System.out.println("------------------------");
        System.out.println("Total : " + cusList.size() + " customers.");
    }

    
    public Company() {
        this.cusList = cusList;
    }

    public void searchByName(String name) {
        ArrayList<Customer> cusL = new ArrayList<>();

        cusL = search(customer -> customer.getName().startsWith(name));
         System.out.println("List of Customers");
        System.out.println("--------------------------");
        for (Customer c : cusL) {
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println("Total : " + cusL.size() + " customers");
    }

    public void searchById(int id) {
        ArrayList<Customer> cusL = new ArrayList<>();

        cusL = search(customer -> customer.getId() == id);
        System.out.println("List of Customers");
        System.out.println("--------------------------");
        for (Customer c : cusL) {
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println("Total : " + cusL.size() + " customers");
    }

    public void searchByPhone(String phone) {
        ArrayList<Customer> cusL = new ArrayList<>();

        cusL = search(customer -> customer.getPhone().startsWith(phone));
         System.out.println("List of Customers");
        System.out.println("--------------------------");
        for (Customer c : cusL) {
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println("Total : " + cusL.size() + " customers");
    }
    public ArrayList<Customer> search(Predicate<Customer> c) {
        ArrayList<Customer> cusL = new ArrayList<>();
        for (Customer customer : cusList) {
            if (c.test(customer)) {
                cusL.add(customer);
            }
        }
        return cusL;
    }
    
    
    public void sortById(){
        cusList.sort(Comparator.comparing(Customer::getId));
    }
    
    public void sortByName(){
        cusList.sort(Comparator.comparing(Customer::getName));
    }
    
    public void statisticalByPhoneViettel() {
        ArrayList<Customer> cusL = new ArrayList<>();

        cusL = search(customer -> customer.getPhone().startsWith("032"));
         System.out.println("List of Customers");
        System.out.println("--------------------------");
        for (Customer c : cusL) {
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println("Total : " + cusL.size() + " customers");
    }
    
    public void statisticalByPhoneMobile() {
        ArrayList<Customer> cusL = new ArrayList<>();

        cusL = search(customer -> customer.getPhone().startsWith("070"));
         System.out.println("List of Customers");
        System.out.println("--------------------------");
        for (Customer c : cusL) {
            System.out.println(c);
        }
        System.out.println("--------------");
        System.out.println("Total : " + cusL.size() + " customers");
    }
}