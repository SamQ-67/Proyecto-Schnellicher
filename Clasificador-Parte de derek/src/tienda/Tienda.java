/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

/**
 *
 * @author Derek
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agua WT = new Agua(false,"MINERAL",12.0,"BONAFONT","BONAFONT",20,300);
        WT.imprimir_Agua();
        System.out.println("-----------------------------------------");
        
        jugos JC = new jugos("Jumex","Manzana","Jumex",true,15,60.0,500);
        JC.Imprimir_Jugos();
        System.out.println("-----------------------------------------");
        
        Alcohol drink = new Alcohol("Tecate Light","Tecate",18,500,17,5.0,1.7);
        drink.Imprimir_Alcohol();
        System.out.println("------------------------------------------");
        
        energeticas energy = new energeticas("Volt","Volt Energy","Limon",28,180,18,17.0,2.9,6.9,60.9,100.0,300.0);
        energy.Imprimir_Energy();
        
    
      
        
                
        
        
        
        
    }
    
}
