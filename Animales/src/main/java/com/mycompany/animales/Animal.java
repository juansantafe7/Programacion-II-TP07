/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

public abstract class Animal {
    private final String nombre;

    protected Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }


    public abstract String hacerSonido();


    public String describirAnimal() {
        return getClass().getSimpleName() + " '" + nombre + "' hace: " + hacerSonido();
    }
}
