/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

public class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }

    @Override
    public String hacerSonido() { return "¡Guau!"; }
}