/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animales = List.of(
            new Perro("Tobi"),
            new Gato("Luna"),
            new Vaca("Lola"),
            new Gato("Michi"),
            new Perro("Rocky")
        );


        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
        }
    }
}