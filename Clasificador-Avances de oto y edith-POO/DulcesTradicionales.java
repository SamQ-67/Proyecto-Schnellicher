/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador;

/**
 *
 * @author Salid
 */
public class DulcesTradicionales extends ProductoD {
protected String paisDeOrigen;
protected String ingredientes;
protected int cantidadIngredientes;
protected boolean esDeTuPais;


public DulcesTradicionales(){
    this.paisDeOrigen= "ninguno";
    this.ingredientes= "ninguno";
    this.cantidadIngredientes = 0;
    this.esDeTuPais = false;
    
    
}

    public DulcesTradicionales(String paisDeOrigen, String ingredientes, int cantidadIngredientes, boolean esDeTuPais, String nombreProducto, String marca, int cantidad) {
        super(nombreProducto, marca, cantidad);
        this.paisDeOrigen = paisDeOrigen;
        this.ingredientes = ingredientes;
        this.cantidadIngredientes = cantidadIngredientes;
        this.esDeTuPais = esDeTuPais;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public void setCantidadIngredientes(int cantidadIngredientes) {
        this.cantidadIngredientes = cantidadIngredientes;
    }

    public boolean isEsDeTuPais() {
        return esDeTuPais;
    }

    public void setEsDeTuPais(boolean esDeTuPais) {
        this.esDeTuPais = esDeTuPais;
    }

  
}

