/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificador;

/**
 *
 * @author Edith Esmeralda
 */
public class Producto {
    private String nombre;
    private String marca;
    private double precio;

    public Producto() { 
        this.nombre = "Sin nombre";
        this.marca = "Sin marca";
        this.precio = 0.0;
    }
    public Producto(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
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
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }

    protected void VerificadorDatos() {
        if(!marca.equals("Sin nombre") ){
            System.out.println ("Marca: " + marca);
        } else {
            System.out.println("No hay datos de la marca");
            
        }
        if(precio != 0.0) {
            System.out.println ("Nombre: " + precio);
        } else {
            System.out.println("No hay datos del precio");
            
        }
    }
}
