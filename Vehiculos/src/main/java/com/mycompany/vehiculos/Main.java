/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculos;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", "Corolla", 4);
        System.out.println(auto.mostrarInfo());


        Vehiculo v = new Auto("Ford", "Focus", 5);
        System.out.println(v.mostrarInfo());
    }
}