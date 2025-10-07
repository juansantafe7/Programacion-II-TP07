/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculos;

public class Vehiculo {

    private String marca;
    private String modelo;


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }


    public String mostrarInfo() {
        return "Vehículo - Marca: " + marca + ", Modelo: " + modelo;
    }
}