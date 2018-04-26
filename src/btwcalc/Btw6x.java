/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btwcalc;

import java.util.Scanner;

/**
 *
 * @author Laptop13
 */
public class Btw6x {

    double invoer;

    public double Berekening2() {
        return invoer;
    }

    void leesInvoer() {
        System.out.println("Over welk bedrag wilt u BTW berekenen?");
        Scanner input = new Scanner(System.in);
        //String invoer = input.nextLine();
        if (input.hasNextDouble()) {
            invoer = input.nextDouble() * 1.06D;
        }
    }
}
