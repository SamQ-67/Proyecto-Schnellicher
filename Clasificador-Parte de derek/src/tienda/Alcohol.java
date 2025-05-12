/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Derek
 */
public class Alcohol extends productos{
   private double gr_alcohol;
   private double litros;
   private double volumen;
   private int edad;

   public Alcohol() {
        super();
        this.gr_alcohol = 0.0;
        this.litros = 0.0;
        this.volumen = 0.0;
        this.edad = 0;
    }
   
    public Alcohol(String nombre, String marca, int precio, int inventario,int edad,double gr_alcohol,double litros) {
        super(nombre, marca, precio, inventario);
        this.gr_alcohol = gr_alcohol;
        this.litros = litros;
        this.edad = edad;
       
    }
    
    public double getGr_alcohol() {
        return gr_alcohol;
    }

    public void setGr_alcohol(double gr_alcohol) {
        this.gr_alcohol = gr_alcohol;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   public String Calcular_Edad_Alc(){
       if(edad <=17){
           System.out.println("---PROHIBIDA LA VENTA A MENORES DE EDAD-------");
       }else if(gr_alcohol >=70.0){
           System.out.println("-----ADVERTENCIA: EXCESO DE ALCOHOL EN BEBIDA,INFORMAR AL COMPRADOR---------");
       }else{

       }return null;
   }
   
   public double calcular_alc(){
       double calcular_alc = litros * gr_alcohol * 0.8 / 100.0;
       return (litros*gr_alcohol*0.8/100.0);
   }
   
   public void Imprimir_Alcohol(){
        calcular_alc();
        Calcular_Edad_Alc();
        super.Imprimir_Pro();
        System.out.println("Alcohol: "+ gr_alcohol);
         System.out.println("Edad: "+ edad);
       
        
      
      
       
   }
   
}
