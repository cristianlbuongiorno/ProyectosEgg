/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmultiplo;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class EsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese 2 numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("el numero uno no es multiplo del segundo");
        }
    }
}
