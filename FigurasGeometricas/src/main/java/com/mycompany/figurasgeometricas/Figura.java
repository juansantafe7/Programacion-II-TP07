/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas;

public abstract class Figura {
    private final String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }


    public abstract double calcularArea();


    @Override
    public String toString() {
        return nombre + " (área=" + calcularArea() + ")";
    }
}
