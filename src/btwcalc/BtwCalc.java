/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btwcalc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laptop13
 */
public class BtwCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welk BTW percentage wilt u gebruiken?");
        System.out.println("Keuze maken uit 6% of 21%/ 6X of 21X voor meerde invoer (% hoeft niet ingevuld te worden)");

        ArrayList<Btw6x> btwtjes6 = new ArrayList<>();
        ArrayList<Btw21x> btwtjes21 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String invoer = "";
        while (!invoer.equals("=") || !invoer.equals("6") || !invoer.equals("21")
                || !invoer.equals("X") || !invoer.equals("6X") || !invoer.equals("21X")) {

            if (invoer.equals("X")) {
                break;
            }

            invoer = input.next();

            switch (invoer) {
                case "21":
                    Btw21 btw21 = new Btw21();
                    btw21.Berekening2(invoer);
                    break;
                case "6":
                    Btw6 btw6 = new Btw6();
                    btw6.Berekening2(invoer);
                    break;
                case "6X":
                    Btw6x btw6x = new Btw6x();
                    //btw6x.Berekening2 (invoer);
                    btw6x.leesInvoer();
                    btwtjes6.add(btw6x);

                    break;
                case "21X":
                    Btw21x btw21x = new Btw21x();
                    //btw21x.Berekening2 (invoer);
                    btw21x.LeesInvoer();
                    btwtjes21.add(btw21x);

                    break;
                case "=":
                    double totaal = 0;
                    for (Btw6x btw6xTmp : btwtjes6) {
                        totaal = totaal + btw6xTmp.Berekening2();
                    }
                    for (Btw21x btw21xTmp : btwtjes21) {
                        totaal = totaal + btw21xTmp.Berekening2();
                    }
                    System.out.println( "Bedrag inclusief BTW " + totaal);
                    int totAf;
                    totAf = (int) Math.round(totaal);
                    System.out.println("Afgerond totaal is: " + totAf);
                    System.exit(0);   
                    
                
            }
        } 
    }
}
