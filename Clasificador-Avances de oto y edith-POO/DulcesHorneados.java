/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasificador;

/**
 *
 * @author Salid
 */
public class DulcesHorneados extends ProductoD {

protected boolean esHorneado;
protected String tipoHarina;
protected boolean tieneMantequilla;
protected int cantidadMantequilla;
protected boolean tienePolvoParaHornear;
protected int tiempoDePreparacion;


public DulcesHorneados(){
    this.esHorneado = false;
    this.tipoHarina = "sin harina";
    this.tieneMantequilla = false;
    this.tienePolvoParaHornear= false;
    this.tiempoDePreparacion = 0;
}

    public DulcesHorneados(boolean esHorneado, String tipoHarina, boolean tieneMantequilla, int cantidadMantequilla, boolean tienePolvoParaHornear, String nombreProducto, String marca, int cantidad) {
        super(nombreProducto, marca, cantidad);
        this.esHorneado = esHorneado;
        this.tipoHarina = tipoHarina;
        this.tieneMantequilla = tieneMantequilla;
        this.cantidadMantequilla = cantidadMantequilla;
        this.tienePolvoParaHornear = tienePolvoParaHornear;
    }

    public boolean isEsHorneado() {
        return esHorneado;
    }

    public void setEsHorneado(boolean esHorneado) {
        this.esHorneado = esHorneado;
    }

    public String getTipoHarina() {
        return tipoHarina;
    }

    public void setTipoHarina(String tipoHarina) {
        this.tipoHarina = tipoHarina;
    }

    public boolean isTieneMantequilla() {
        return tieneMantequilla;
    }

    public void setTieneMantequilla(boolean tieneMantequilla) {
        this.tieneMantequilla = tieneMantequilla;
    }

    public int getCantidadMantequilla() {
        return cantidadMantequilla;
    }

    public void setCantidadMantequilla(int cantidadMantequilla) {
        this.cantidadMantequilla = cantidadMantequilla;
    }

    public boolean isTienePolvoParaHornear() {
        return tienePolvoParaHornear;
    }

    public void setTienePolvoParaHornear(boolean tienePolvoParaHornear) {
        this.tienePolvoParaHornear = tienePolvoParaHornear;
    }

    public int getTiempoDePreparacion() {
        return tiempoDePreparacion;
    }

    public void setTiempoDePreparacion(int tiempoDePreparacion) {
        this.tiempoDePreparacion = tiempoDePreparacion;
    }

}