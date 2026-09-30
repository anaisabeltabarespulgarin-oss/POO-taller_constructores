/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.habitacion;

/**
 *
 * @author Ana
 */
public class Habitacion {

    public int numero;
    public String tipo;
    public double precioNoche;
    public boolean ocupada;
    
    public Habitacion(int numero, String tipo, double precioNoche, boolean ocupada) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada; 
    }
    
    public Habitacion(int numero, String tipo){
        this(numero,tipo,120000.0,false);
    }
    
    public void ocupar() {
        this.ocupada = true;
    }
    
    public boolean estaDisponible(){
        return !this.ocupada;
    }
    
    public double calcularEstadia(int noches) {
        return this.precioNoche * noches;
    }
    
    public double calcularEstadia(int noches, double descuento) {
        double subtotal= this.calcularEstadia(noches);
        return subtotal - (subtotal*(descuento/100.0)) ;
    }
    
    public void mostrarInfo(){
        String estado = this.ocupada ? "Ocupada" : "Disponible";
        System.out.println("Habitacion: " + this.numero + " | Tipo: " + this.tipo + " | Precio de la noche: $ " + this.precioNoche + " | Estado: " + this.ocupada);
    }
    
   
}
