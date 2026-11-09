/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Metodos {

    //CALCULADORA
    public static void mostrarMensaje() {
        System.out.println("***BIENVENIDO A LA CALCULADORA** ");
    } //Fin Mostrar Mensaje

    //Con parametros y sin retornos 
    public static void mostrarSuma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println(" Resultado: " + resultado);

    }

    //Sin parametros y con retorno  
    public static int obtenerNumero() {
        return 15;

    }

    //Parametros y con retorno
    public static double Multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;

    }

    public static void mostrarMenu() {
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicacion");
        System.out.println(" 4. Division");

        System.out.println(" Seleccione una opcion: ");

    }

//metodo con parametros y con retorno sumar, restar,dividir
    public static double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;

    }

    public static double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;

    }

    public static double dividir(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;

    }

    public static double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;

    }

    public static void mostrarResultado(double resultado) {
        System.out.println(" Mostrar resultado " + resultado);
    }

    public static void main(String[] args) {

        // mostrarSuma(10,5);
        int numero = obtenerNumero();
        System.out.println("El resultado de obtener numero es " + numero);
        //double multiplicacion= Multiplicar(20, 2);
        // System.out.println("El resulado de la multiplicacion es  " + multiplicacion);

        //CALCULADORA
        //mostrarMensaje();
        mostrarMenu();

        int opcion;
        double numero1;
        double numero2;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        opcion = entrada.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Opcion Incorrecta");
            return; // termina el programa aquí
        }

        System.out.println("Ingrese el primer numero 1");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero 2");
        numero2 = entrada.nextDouble();

        switch (opcion) {
            case 1://suma
                resultado = sumar(numero1, numero2);
                System.out.println("El resulado de la suma es: " + resultado);
                mostrarResultado(resultado);

                break;
            case 2://resta
                resultado = restar(numero1, numero2);
                System.out.println("El resulado de la resta es: " + resultado);
                mostrarResultado(resultado);

                break;

            case 3://multiplicar
                resultado = multiplicar(numero1, numero2);
                System.out.println("El resulado de la multiplicacion es: " + resultado);
                mostrarResultado(resultado);

                break;

            case 4://division
                //VALIDAR QUE NO SE DIVIDA ENTRE 0
                if (numero2 != 0) {
                    resultado = dividir(numero1, numero2);
                    System.out.println("El resulado de la division es: " + resultado);
                    mostrarResultado(resultado);
                } else {
                    System.out.println("No se puede dividir el numero entre Cero ");

                }

                break;

            default:
                System.out.println("Opcion Incorrecta ");
        }

    }

}
