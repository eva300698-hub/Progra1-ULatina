/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;
import java.time.Clock;
import java.util.Scanner;



/**
 *
 * @author laboratorio
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    
    //GLOBAL
    //static Scanner entrada = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
    //Mensaje de Bienvenida     
       System.out.println("Hola soy Evaristo");
       System.out.println("Bienvenidos al sistema");
       System.out.println("*** Semana 7***");
       
       //Variables
       int cantidad = 2; //Variable numerica de numero entero
       double precio = 8000.01; //Variable numerica con decimales
       char categoria = 'A'; //Se utilza cuando se coloca un solo caracter 
       String producto = "Teclado"; // Variable Texto
       boolean disponible =true; //Variable booleana
       
       System.out.println("Producto " + producto);
       System.out.println("Cantidad: " + cantidad);   
       System.out.println("Precio " + precio);
       System.out.println("Categoria " + categoria );
       System.out.println("Disponible " + disponible);
       
       //datos en consola con scanner
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre"); 
        String nombre = entrada.nextLine();
        
      //Mostrar lo que almacena el usuario
        System.out.println("Su nombre es: " +nombre);
        
        
      
      //El usuario ingrese los datos de otro producto
System.out.println("Ingrese el nombre del producto");
String producto2 = entrada.nextLine();

System.out.println("Ingrese la cantidad");
int cantidad2 = entrada.nextInt();
 
System.out.println("Ingrese el precio");
double precio2 = entrada.nextDouble();
 
System.out.println("Ingrese la categoria (una letra)");
 //char categoria2 = 'B';
 char categoria2 = entrada.next().charAt(0);  
 
//System.out.println("Ingrese el diponible");
//int disponible2 = entrada.nextInt();


//Mostrar los datos del segundo producto

//INTEGER
//int cantidad3 = Integer.parseInt(nombre)

System.out.println("Producto " + producto2);
System.out.println("Cantidad: " + cantidad2);
System.out.println("Precio " + precio2);
System.out.println("Categoria " + categoria2);
//System.out.println("Disponible: " + disponible2);

//calcular el subtotal
double  subtotal = precio2*cantidad2;

//Mostrar Como factura
System.out.println("***FACTURA***");
System.out.println("Producto " + producto2);
System.out.println("Costo " + precio2) ;
System.out.println("Cantidad comprados " + cantidad2 );
System.out.println("Subtotal " + subtotal);

double  descuento = 0;
        if (subtotal>=15000) {
            descuento=subtotal *0.05;
            System.out.println("Descuento del 5% aplicado ");
   
        } else{
            System.out.println("El monto no aplica para descuento ");
                        
        }//FIN if-elseDE LA LLAVE
     
        double total= subtotal-descuento;
        System.out.println("Descuento aplicado " + descuento);
        System.out.println("Total a pagar es:  " + total);
        
    }
    
}
