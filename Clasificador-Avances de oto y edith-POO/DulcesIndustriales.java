/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador;

/**
 *
 * @author Salid
 */
public class DulcesIndustriales extends ProductoD{
protected String nombreDeLaEmpresaFabricante;
protected String ingredientes;
protected double cantidadDeIngredientes;
protected String endulcorantes;
protected String conservadores;

 public DulcesIndustriales(){
     this.nombreDeLaEmpresaFabricante = "sin nombre ";
        this.ingredientes = "sin ingredientes";
        this.cantidadDeIngredientes = 0.0;
        this.endulcorantes = "sin endulcorantes";
        this.conservadores = "sin conservadores";
 }   

public DulcesIndustriales(String nombreDeLaEmpresaFabricante, String ingredientes, double cantidadDeIngredientes, String endulcorantes, String conservadores, String nombreProducto, String marca, int cantidad) {
        super(nombreProducto, marca, cantidad);
        this.nombreDeLaEmpresaFabricante = nombreDeLaEmpresaFabricante;
        this.ingredientes = ingredientes;
        this.cantidadDeIngredientes = cantidadDeIngredientes;
        this.endulcorantes = endulcorantes;
        this.conservadores = conservadores;
    }

    public String getNombreDeLaEmpresaFabricante() {
        return nombreDeLaEmpresaFabricante;
    }

    public void setNombreDeLaEmpresaFabricante(String nombreDeLaEmpresaFabricante) {
        this.nombreDeLaEmpresaFabricante = nombreDeLaEmpresaFabricante;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getCantidadDeIngredientes() {
        return cantidadDeIngredientes;
    }

    public void setCantidadDeIngredientes(double cantidadDeIngredientes) {
        this.cantidadDeIngredientes = cantidadDeIngredientes;
    }

    public String getEndulcorantes() {
        return endulcorantes;
    }

    public void setEndulcorantes(String endulcorantes) {
        this.endulcorantes = endulcorantes;
    }

    public String getConservadores() {
        return conservadores;
    }

    public void setConservadores(String conservadores) {
        this.conservadores = conservadores;
    }



}
