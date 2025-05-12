/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificador;

/**
 *
 * @author Edith Esmeralda
 */
// Tradicionales, Saborizadas, Gourmet, Saludables, Locales o Artesanales
public class Papitas extends Producto {
    private String tipo; 

    public Papitas() {
        super();
        this.tipo = "Sin tipo";
    }

    public Papitas(String nombre, String marca, double precio,String tipo) {
        super(nombre, marca, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    protected void VerificadorDatos() {
        if(!tipo.equals("Sin tipo") ){
            System.out.println ("Marca: " + tipo);
        } else {
            System.out.println("No hay datos del tipo");
        }
        
    }
}