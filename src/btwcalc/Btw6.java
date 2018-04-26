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
public class Btw6 {
    
    public void Berekening2(String invoer){
        // Dit is de klasse die de berekening uitvoerd voor 21%
        
        
        System.out.println("Over welk bedrag wilt u BTW berekenen?");
        Scanner input = new Scanner(System.in);
        //String invoer = input.nextLine();
        double invoer2 = input.nextDouble();

        double bedragexclbtw6 = invoer2;
        System.out.println("Bedrag exclusief BTW is : " + invoer2);
        System.out.println("Gekozen BTW percentage is :" + invoer + "%");
        
        double bedraginclbtw6 = (invoer2 / 100 * 106);
        System.out.println("Bedrag inclusief 6% BTW is :"+ bedraginclbtw6);

         System.exit(0);
}
}