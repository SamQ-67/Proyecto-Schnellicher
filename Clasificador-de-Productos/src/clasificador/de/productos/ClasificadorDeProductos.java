/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificador.de.productos;

/**
 *
 * @author ririo
 */
public class ClasificadorDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bebidas produ = new Bebidas();
        produ.setMarca("Coca-Cola");
        produ.setNombre("Sidra");
        produ.setC_Liquido(true);
        produ.setMl(1200);
        produ.checarBebida();
    }
    
}
