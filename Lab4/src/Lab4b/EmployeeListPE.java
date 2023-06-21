/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4b;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class EmployeeListPE {

    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
    private ArrayList<PartTimeEmployee> listPE = new ArrayList<>();

    public EmployeeListPE() {
        this.listPE = new ArrayList<>();
    }

    public EmployeeListPE(ArrayList<PartTimeEmployee> listPE) {
        this.listPE = listPE;
    }

    public void addEmployeeList2(PartTimeEmployee employee) {
        listPE.add(employee);
    }

    public void printEmployeeList() {
        for (PartTimeEmployee partTimeEmployee : listPE) {
            System.out.println(partTimeEmployee);
        }
    }

    public void sortList() {
        Collections.sort(listPE, new Comparator<PartTimeEmployee>() {
            @Override
            public int compare(PartTimeEmployee e1, PartTimeEmployee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return -1;
                } else if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public boolean removeEmployee(PartTimeEmployee otherEmployee) {
        return this.listPE.remove(otherEmployee);
    }

    public String averagesalary() {
        double totalSalary = 0;
        for (PartTimeEmployee partTimeEmployee : listPE) {
            totalSalary += partTimeEmployee.getSalary();
        }
        double averagesalary = totalSalary / listPE.size();
        return numf.format(averagesalary);
    }
}
