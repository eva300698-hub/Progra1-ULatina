/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra_objetos;

/**
 *
 * @author laboratorio
 */
public class Sistema_Vehiculos {

    public static void main(String[] args) {
        Progra_Objetos vehiculo1 = new Progra_Objetos("Toyota", "Yaris ", "Negro", 2017);

        Progra_Objetos vehiculo2 = new Progra_Objetos("Lexus", "MC256 ", "Blanco", 2026);

        Progra_Objetos vehiculo3 = new Progra_Objetos("BMW", "M3Code ", "Azul/Blaco", 2020);

        vehiculo1.mostrarInformacion();
        vehiculo2.mostrarInformacion();
        vehiculo3.mostrarInformacion();

        System.out.println("ENCENDIENDO VEHICULO 1");

        vehiculo1.encender();
        vehiculo1.acelerar(30);
        vehiculo1.acelerar(20);
        vehiculo1.acelerar(10);
         
        System.out.println("Marca del Vehiculo 1 " + vehiculo1.getMarca());
        System.out.println("Marca del Vehiculo 2 " + vehiculo2.getColor());
        vehiculo3.setFabricacion(2005);
        
        System.out.println(" El ano del vehiculo3 modificado es: " + vehiculo3.getFabricacion());
        
//metodo con parametros y retorno
vehiculo3.acelerar(30);

double nuevaVelocidad;
nuevaVelocidad = vehiculo3.calcularNuevaVelocidad(20);
        System.out.println("La nueva velocidad seria " + nuevaVelocidad);
        System.out.println("El valor de velocidad no cambio es: " + vehiculo3.getVelocidad());
      
        if (vehiculo3.estaEncendido()) {
            System.out.println(" El vehiculo esta en funcionamiento ");
        }else{
            
            System.out.println(" El Vehiculo esta apagado ");
        }
        
        
    }

}
