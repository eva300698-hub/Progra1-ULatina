/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author laboratorio
 */
        //ArrayList
        //ad() agregar
        //remove () borrar
        //get()trae       
        //set ()
        //size() tamaño
        //Integer, Double, Booolean
//guarda

public class Registro_ArrayList {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
  ArrayList<Double> notas = new ArrayList<>();
  //double nota=0;
  
 
  //Guardar
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la nota " + (i+1));
            double nota=entrada.nextDouble();
            
            notas.add(nota);
        }
  //Mostrar
  System.out.println(" **** NOTAS INGRESADAS*** ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(" Nota " + (i+1)+ ":" + notas.get(i) );
         
        }
        System.out.println("Ingrese otra nota ");   
        double notaNew= entrada.nextDouble();
        notas.add(notaNew);
        System.out.println(" Nota Ingresada ");
        System.out.println("El tamano del Array es: " + notas.size());

        
        //modificar campo
        System.out.println("Ingrese la pocicion que desea modificar ");
        int posicion = entrada.nextInt();
        
        System.out.println("Ingrese la nota modificada");
        double notaModificada= entrada.nextDouble();
        notas.set(posicion-1, notaModificada);
        
          System.out.println(" **** NOTAS INGRESADAS*** ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(" Nota " + (i+1)+ ":" + notas.get(i) );
         
        }
        //Eliminar 
        System.out.println(" Ingrese la pocision que desea eliminar");
        posicion= entrada.nextInt();
        notas.remove(posicion-1);
        
          System.out.println(" **** NOTAS INGRESADAS*** ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(" Nota " + (i+1)+ ":" + notas.get(i) );
         
        }
        
  
    }
   
}
