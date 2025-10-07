/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 800_000, 5));
        empleados.add(new EmpleadoTemporal("Luis", 160, 3500));
        empleados.add(new EmpleadoPlanta("Carla", 1_050_000, 2));
        empleados.add(new EmpleadoTemporal("Diego", 90, 4200));


        for (Empleado e : empleados) {
            System.out.printf("%s -> sueldo: $%,.2f%n", e.getNombre(), e.calcularSueldo());
        }

        System.out.println("\nClasificación con instanceof:");
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.getNombre() + " es Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.getNombre() + " es Empleado Temporal");
            }
        }


        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta ep) {
                System.out.println("Antigüedad de " + ep.getNombre() + ": " + ep.getAniosAntiguedad() + " años");
            }
        }
    }
}