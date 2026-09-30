/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paquete;

/**
 *
 * @author Ana
 */
public class Paquete {
    
    public String codigo;
    public String destino;
    public double peso;
    public boolean asegurado;
    
    public Paquete (String codigo, String destino, double peso, boolean asegurado ) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }
    
    public Paquete (String codigo, String destino) {
        this(codigo,destino,1.0,false);
    }
    
    public Paquete (String codigo){
        this(codigo,"Por asignar");
    }
    
    public void mostrarInfo(){
        System.out.println(this.codigo + "->" + this.destino + "|" + this.peso + "|" + this.asegurado + ".");
    }
    
    public void actualizarPeso(double peso){
        this.peso = peso;
    }
    
    public double calcularCosto(){
        double costoBase = this.peso * 5000;
        if (this.asegurado) {
            costoBase += 10000;
        }
        return costoBase;
    }
    
    public double calcularCosto(double tarifaPorKilo) {
        double costoTotal = this.peso * tarifaPorKilo;
        if(this.asegurado){
            costoTotal += 8000;
        }
        return costoTotal;
    }
}


    
