/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.habitacion;

/**
 *
 * @author Ana
 */
public class Hotel {
    
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(101, "Sencilla", 120000.0, false);
        
        Habitacion h2 = new Habitacion(102, "Doble", 180000.0, false );
        
        Habitacion h3 = new Habitacion(103, "Suit");
        
        h1.ocupar();
        
        h1.mostrarInfo();
        h2.mostrarInfo();
        h3.mostrarInfo();
        
        
        double estadiaNormal = h3.calcularEstadia(3);
        double estadiaConDescuento = h3.calcularEstadia(3, 10.0);
        System.out.println("Estadia 3 noches (sin descuento): $" + estadiaNormal);
        System.out.println("Estadia 3 noches (con 10% descuento): $" + estadiaConDescuento);
        
        
        
        
        
    }

    
}
