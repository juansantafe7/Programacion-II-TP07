/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        super("Círculo");
        if (radio <= 0) throw new IllegalArgumentException("El radio debe ser > 0");
        this.radio = radio;
    }

    public double getRadio() { return radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
