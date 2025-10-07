/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        if (base <= 0 || altura <= 0)
            throw new IllegalArgumentException("Base y altura deben ser > 0");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
