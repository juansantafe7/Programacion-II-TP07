/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados;

public abstract class Empleado {
    private final String nombre;

    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
               "nombre='" + nombre + '\'' +
               ", sueldo=" + String.format("%.2f", calcularSueldo()) +
               '}';
    }
}
