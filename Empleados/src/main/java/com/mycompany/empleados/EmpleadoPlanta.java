/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

public class EmpleadoPlanta extends Empleado {
    private final double sueldoBase;
    private final int aniosAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, int aniosAntiguedad) {
        super(nombre);
        if (sueldoBase <= 0) throw new IllegalArgumentException("Sueldo base > 0");
        if (aniosAntiguedad < 0) throw new IllegalArgumentException("Antigüedad >= 0");
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSueldoBase() { return sueldoBase; }
    public int getAniosAntiguedad() { return aniosAntiguedad; }

    @Override
    public double calcularSueldo() {

        double adicionalAntig = sueldoBase * 0.02 * aniosAntiguedad;
        return sueldoBase + adicionalAntig;
    }
}