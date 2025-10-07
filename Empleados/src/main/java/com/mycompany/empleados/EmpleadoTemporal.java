/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

public class EmpleadoTemporal extends Empleado {
    private final int horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        if (horasTrabajadas < 0) throw new IllegalArgumentException("Horas >= 0");
        if (valorHora <= 0) throw new IllegalArgumentException("Valor hora > 0");
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getValorHora() { return valorHora; }

    @Override
    public double calcularSueldo() {

        return horasTrabajadas * valorHora;
    }
}
