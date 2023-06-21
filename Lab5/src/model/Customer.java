/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Customer {

    private int id;
    private String Name;
    private String Phone;

    public Customer(int CustomerID, String Name, String Phone) {
        this.id = CustomerID;
        this.Name = Name;
        this.Phone = Phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
        
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    

    @Override
    public String toString() {
        return "Customer{" + "CustomerID=" + id + ", Name=" + Name + ", Phone=" + Phone + '}';
    }

}
