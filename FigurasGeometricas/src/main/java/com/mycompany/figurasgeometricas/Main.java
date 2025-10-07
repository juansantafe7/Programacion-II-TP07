/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[] {
            new Circulo(2.5),
            new Rectangulo(4, 3),
            new Circulo(1.2),
            new Rectangulo(10, 0.5)
        };

        for (Figura f : figuras) {

            System.out.printf("%s -> área = %.2f%n", f.getNombre(), f.calcularArea());
        }
    }
}
