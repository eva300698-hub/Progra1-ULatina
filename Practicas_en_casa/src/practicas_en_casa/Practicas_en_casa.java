/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas_en_casa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elope
 */
public class Practicas_en_casa {

    public static void SaludoInicial() {
        System.out.println("========================================= ");
        System.out.println("Tienda: Tienda Tecnologica");
        System.out.println("Programador: Evaristo Lopez");
        System.out.println("Sistema de Inventario");
        System.out.println("========================================= ");

    }

    public static int GenerarCodigo() {
        Random aleatorio = new Random();
        int codigo = aleatorio.nextInt(900) + 100;
        return codigo;
    }

    public static void MostrarProducto(String nombre, double cantidad, double precio) {
        System.out.println(" Nombre " + nombre + " |Cantidad: " + cantidad + "| Precio " + precio);

    }

    
    
    
    
    //public static double /**
    public static void main(String[] args) {
        // TODO code application logic here

        SaludoInicial();

        int opcion;
        int totalProductos = 0;
        int espacio;
        int cuantos;
        int posicion;

        Scanner entrada = new Scanner(System.in);

        String[] productos = new String[5];
        double[][] inventario = new double[5][2];

        do {
            System.out.println("========= SISTEMA DE INVENTARIO ========= ");
            System.out.println("1. Registrar productos");
            System.out.println("2. Mostrar inventario completo");
            System.out.println("3. Consultar producto por posicion");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    espacio = 5 - totalProductos;
                    if (espacio == 0) {
                        System.out.println(" Error: el inventario esta lleno (maximo 5 productos ");

                    } else {
                        System.out.println(" Espacio disponible: " + espacio + " producto(s).");

                        do {
                            System.out.println("Cuantos productos desea registrar? (1 a " + espacio + "): ");
                            cuantos = entrada.nextInt();
                            if (cuantos < 1 || cuantos > espacio) {
                                System.out.println("Cantidad no valida. Intente de nuevo. ");

                            }

                        } while (cuantos < 1 || cuantos > espacio);

                        entrada.nextLine();
                        for (int i = 1; i <= cuantos; i++) {
                            System.out.println("--- Producto " + i + " de " + cuantos + " ---");

                            System.out.println(" Nombre del producto: ");
                            productos[totalProductos] = entrada.nextLine();
                            do {
                                System.out.println(" Cantidad Disponible: ");
                                inventario[totalProductos][0] = entrada.nextDouble();
                                if (inventario[totalProductos][0] < 0) {
                                    System.out.println("La cantidad no puede ser negativa ");
                                }

                            } while (inventario[totalProductos][0] < 0);
                            do {
                                System.out.println(" Precio Unitario ");
                                inventario[totalProductos][1] = entrada.nextDouble();
                                if (inventario[totalProductos][1] < 0) {
                                    System.out.println(" El precio no puede ser negativo ");

                                }

                            } while (inventario[totalProductos][1] < 0);
                            entrada.nextLine();
                            System.out.println(" Codigo generado: " + GenerarCodigo());
                            totalProductos++;

                        }
                        System.out.println("Productos registrados correctamente.");

                    }

                    break;

                case 2:

                    if (totalProductos == 0) {
                        System.out.println(" No se han registrado productos. ");
                    } else {
                        System.out.println("========= INVENTARIO COMPLETO ========= ");
                        for (int i = 0; i < totalProductos; i++) {
                            System.out.println("Posicion " + (i + 1) + ": ");
                            MostrarProducto(productos[i], inventario[i][0], inventario[i][1]);

                        }
                        System.out.println(" Total productos registrados: " + totalProductos);
                    }

                    break;

                case 3:

                    System.out.println(" Ingrese la pocicion deseada ");
                    entrada.nextLine();
                    posicion = Integer.parseInt(entrada.nextLine());
                    System.out.println(posicion);
                    MostrarProducto(productos[posicion-1],inventario[posicion-1][0],inventario[posicion-1][1]);

                    break;

                case 4:

                    System.out.println(" Test OP4 ");

                    break;
                case 5:
                    System.out.println(" Saliendo del sistema. Hasta pronto. ");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
            }

        } while (opcion != 5);

    }

}
