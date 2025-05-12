/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador;

/**
 *
 * @author Salid
 */
public class DulcesArtificiales extends DulcesIndustriales {
protected String sabor;
protected String quimicos;
protected String saborizantes;

public DulcesArtificiales(){
    this.sabor = "sin sabor";
    this.quimicos = "sin quimicos";
    this.saborizantes = "sin saborizantes";
    
    
}

    public DulcesArtificiales(String sabor, String quimicos, String saborizantes, String nombreDeLaEmpresaFabricante, String ingredientes, double cantidadDeIngredientes, String endulcorantes, String conservadores, String nombreProducto, String marca, int cantidad) {
        super(nombreDeLaEmpresaFabricante, ingredientes, cantidadDeIngredientes, endulcorantes, conservadores, nombreProducto, marca, cantidad);
        this.sabor = sabor;
        this.quimicos = quimicos;
        this.saborizantes = saborizantes;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getQuimicos() {
        return quimicos;
    }

    public void setQuimicos(String quimicos) {
        this.quimicos = quimicos;
    }

    public String getSaborizantes() {
        return saborizantes;
    }

    public void setSaborizantes(String saborizantes) {
        this.saborizantes = saborizantes;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
