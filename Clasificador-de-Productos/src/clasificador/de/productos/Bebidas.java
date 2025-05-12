/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificador.de.productos;

/**
 *
 * @author ririo
 */
public class Bebidas {
    private String nombre;
    private String marca;
    private boolean C_Liquido;
    private int ml;
    
    public Bebidas(){
        this.nombre = "X--Sin dato--X";
        this.marca = "X--Sin dato--X";
        this.C_Liquido = false;
        this.ml = 0;
    }

    public Bebidas(String nombre, String marca, boolean Liquido, int ml) {
        this.nombre = nombre;
        this.marca = marca;
        this.C_Liquido = Liquido;
        this.ml = ml;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isC_Liquido() {
        return C_Liquido;
    }

    public void setC_Liquido(boolean C_Liquido) {
        this.C_Liquido = C_Liquido;
    }
    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
    
    
    public void checarBebida() {
        if (C_Liquido && ml > 0) {
        System.out.println("Producto: " + nombre + "Marca: " + marca + "Contenido: " + ml + " ml\nClasificación: Es una bebida.");
        }else {
        System.out.println("Producto: " + nombre + "Marca: " + marca + "Contenido: " + ml + " ml\nClasificación: No es una bebida.");
        }
    }

    
}
