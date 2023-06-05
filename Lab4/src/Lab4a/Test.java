/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4a;

import java.text.DecimalFormat;

/**
 *
 * @author PC
 */

public class Test {

    public static void main(String[] args) {
        OfficialEmployee OE = new OfficialEmployee(17, "Dinh","Tam", 20,05, 31, 8);
        PartTimeEmployee PE = new PartTimeEmployee(17, "Ngoc","Tam", 20, 07, 28);

        System.out.println(OE);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber1 = decimalFormat.format(OE.salary());
        System.out.println("This employee's salary is " + formattedNumber1 + " VND");

        System.out.println(PE);
        String formattedNumber2 = decimalFormat.format(PE.salary());
        System.out.println("This employee's salary is " + formattedNumber2 + " VND");

    }
}
