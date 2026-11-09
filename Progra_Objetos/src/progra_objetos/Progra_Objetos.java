/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progra_objetos;

/**
 *
 * @author laboratorio
 */
public class Progra_Objetos {

    private String marca;
    private String modelo;
    private String color;
    private int fabricacion;
     double velocidad;
    private boolean encendido;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public Progra_Objetos(String marca, String modelo, String color, int fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fabricacion = fabricacion;
        this.velocidad = 0;
        this.encendido = false;

    }

//acciones
    public void encender() {

        encendido = true;
        System.out.println("El Vehiculo esta encendido ");
    }

    public boolean estaEncendido() {
        return encendido;

    }

    public void acelerar(double cantidad) {
        velocidad = velocidad + cantidad;
        System.out.println("Velocidad actual " + velocidad);
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void frenar(double cantidad) {
        velocidad = velocidad - cantidad;
        if (velocidad < 0) {
            velocidad = 0;
        }
        System.out.println("Velocidad actual " + velocidad);
        System.out.println("Frenando...");

    }

    public void apagar() {
        if (velocidad == 0) {
            encendido = false;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println(" El vehiculo esta apagado ");

        }

    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Fabricacion: " + fabricacion);
        System.out.println("Velocidad: " + velocidad + " Km/h ");
    }

    public double calcularNuevaVelocidad(double aumento) {
        return velocidad + aumento;

    }

    public static void main(String[] args) {

    }

}
