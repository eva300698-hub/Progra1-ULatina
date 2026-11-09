/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;
import java.util.Scanner;

public class Practica_estructuras {

    public static void main(String[] args) {
        // contador con mientras
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Numero: " + contador);
            contador++;
        }

        Scanner dato = new Scanner(System.in);
        int opcion;

        // do-while - Switch case
        // menu que se repite hasta que el usuario decida
        do {
            // Instrucciones
            System.out.println("***BIENVENIDO AL MENU PRINCIPAL***");
            System.out.println("1. Mensaje");
            System.out.println("2. Consejo");
            System.out.println("3. Salir");

            System.out.println("Ingrese una opcion");
            opcion = Integer.parseInt(dato.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("**BIENVENIDO AL MUNDO");
                    break;
                case 2:
                    System.out.println("GUARDA SIEMPRE TU AVANCE");
                    break;
                case 3:
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }   // cierra el switch

        } while (opcion != 3);

        // PARA O FOR
        System.out.println("Cuantos datos desea ingresar");
        int cantidad = Integer.parseInt(dato.nextLine());

        String producto;
        double precio;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Nombre del producto ");
            producto = dato.nextLine();
            System.out.println("Precio del producto ");
            precio = Double.parseDouble(dato.nextLine());

            System.out.println("PRODUCTO INGRESADO ");
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precio);
            System.out.println("Registro completo ");
        }

        dato.close();   // se cierra al final, cuando ya no lo necesitas
    }   // cierra main
}       // cierra la clase