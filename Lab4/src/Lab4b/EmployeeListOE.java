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

public class EmployeeListOE {

    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
    

    private ArrayList<OfficialEmployee> listOE = new ArrayList<>();

    public EmployeeListOE(ArrayList<OfficialEmployee> list) {
        this.listOE = listOE;
    }

    public EmployeeListOE() {
        this.listOE = new ArrayList<>();
    }

    public void addEmployeeList1(OfficialEmployee employee) {
        listOE.add(employee);
    }

    public void printEmployeeList() {
        for (OfficialEmployee officialEmployee : listOE) {
            System.out.println(officialEmployee);
        }
    }

    public void sortList() {
        Collections.sort(listOE, new Comparator<OfficialEmployee>() {
            @Override
            public int compare(OfficialEmployee e1, OfficialEmployee e2) {
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

    public boolean removeEmployee(OfficialEmployee otherEmployee) {
        return this.listOE.remove(otherEmployee);
    }

    public String averagesalary() {
        double totalSalary = 0;
        for (OfficialEmployee officialEmployee : listOE) {
            totalSalary += officialEmployee.getSalary();
        }
        double averagesalary = totalSalary / listOE.size();
       
        return numf.format(averagesalary);
    }

}
