/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author elope
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        String nombre;
        String[] lista = new String[3];

        // Llenar el arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese el nombre " + (i + 1) + ": ");
            nombre = entrada.nextLine();
            lista[i] = nombre;
        }

        // Mostrar el arreglo al final
        System.out.println("===== NOMBRES REGISTRADOS =====");
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }
    }

}
