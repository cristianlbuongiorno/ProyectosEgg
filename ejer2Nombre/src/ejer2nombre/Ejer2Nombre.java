/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2nombre;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejer2Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
