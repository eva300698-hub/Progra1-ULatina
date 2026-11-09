/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_resp_usuario;
import java.util.Scanner;

/**
 *
 * @author elope
 */
public class Contador_resp_usuario {

    /**
     * @param args the command line arguments
     */
   
  
    public static void main(String[] args) {
      Scanner dato = new Scanner (System.in);
        System.out.println("Hasta que numero desea contar?? ");
        int limite = Integer.parseInt(dato.nextLine());
        
        int cantidad=1;
        while (cantidad <=limite) {  
        System.out.println("Numero " + cantidad);
        cantidad++;
        
        
        }        
        
        dato.close();
        // TODO code application logic here
    }
    
}
