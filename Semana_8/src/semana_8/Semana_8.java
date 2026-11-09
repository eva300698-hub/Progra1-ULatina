/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_8;
import java.util.Scanner;
/**
 *
 * @author laboratorio
 */
public class Semana_8 {

    /**
     * @param args the command line arguments
     */
    //Iterador efectua los ciclos 
    //Indice marca el consecutivo 0 hasta n-1
    //Indice 1 hasta N
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
                
        //Vector
        int[] notas= new int [5];
        //0-1-2-3-4-5
        
        
        
        
        //ArrayList
        //ad() agregar
        //remove () borrar
        //get()trae       
        //set ()
        //size() tamaño
        //Integer, Double, Booolean 
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i+1)); 
            notas[i]=dato.nextInt();
            
        }
        
        //Muestra
        System.out.println(" **** NOTAS INGRESADAS*** ");
        for (int i = 0; i < notas.length; i++) {
        System.out.println("Nota " + (i+1)+ ":" + notas[i]);
           
        }
        
        int suma=0;
        //Promedio
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
                 
        }
        
        int promedio = suma /notas.length;
        System.out.println("El promedio es " + promedio);
        
        
        
        
    }
    
}
