/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Derek
 */
public class productos {
    protected String nombre;
    protected String marca;
    protected int precio;
    protected int inventario;
    protected int cantidad;
    
    public productos(){
        super();
        this.nombre = "SIN NOMBRE";
        this.marca = "SIN MARCA";
        this.precio = 0;
        this.inventario = 0;
        this.cantidad = 0;
    }

    public productos(String nombre, String marca, int precio, int inventario) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.inventario = inventario;  
        
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    
    public void Imprimir_Pro(){
        System.out.println("///////MOSTRAR PRODUCTO///////");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Marca: "+ marca);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: "+ inventario);
    }
}
