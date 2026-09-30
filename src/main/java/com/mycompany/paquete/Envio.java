/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package com.mycompany.paquete;

import java.util.Locale;

/**
 *
 * @author Ana
 */
public class Envio {
    public static void main(String[] args) {
        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        
        Paquete p2 = new Paquete("P-002", "Pereira", 1.0, false);
        
        Paquete p3 = new Paquete("P-003", "Por asignar", 1.0, false);
        
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        
        p3.actualizarPeso(2.5);
        
        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
        System.out.println("Total del envio: " + total);
        
        System.out.println("La tarifa del paquete 1 con 4000: " + p1.calcularCosto(4000));
        System.out.println("La tarifa del paquete 2 con 4000: " + p2.calcularCosto(4000));
        
    }
}