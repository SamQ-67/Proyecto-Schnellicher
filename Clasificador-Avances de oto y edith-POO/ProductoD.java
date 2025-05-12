/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador;

/**
 *
 * @author Salid
 */
public class ProductoD {
protected String nombreProducto;
protected String marca;
protected int cantidad; 
public ProductoD(){
    this.nombreProducto = "sin nombre";
    this.marca= "sin marca";
    this.cantidad= 0;
}
    public ProductoD(String nombreProducto, String marca, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

  

        
    


    


