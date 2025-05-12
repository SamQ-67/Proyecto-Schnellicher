package tienda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class Agua extends productos{
   private boolean agua;
   private String tipo_agua;
   private double fa;
   private double gr;
   private double azucar;
   private double litros;
   private double g;
   
   public Agua(){
       super();
       this.agua = false;
       this.tipo_agua = "NO TIENE TIPO";
       this.gr = 0.0; 
    }
   
   public Agua(boolean agua, String tipo_agua,double gr,String nombre,String marca,int precio,int inventario) {
        super(nombre, marca, precio, inventario);
        this.agua = agua;
        this.tipo_agua = tipo_agua;
        this.gr = gr;
    }
   
   public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
   
    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = fa;
    }

    public double getGr() {
        return gr;
    }

    public void setGr(double gr) {
        this.gr = gr;
    }
  
    public String calcular_agua(){
        if(agua == true){
            System.out.println("ES AGUA");
        }
        return null;
    }
    
    public double calcular_TM(){
        double gr = (fa - 32)* 5/9;
        return (fa - 32 + 5/9);
    }
    
    public double calcular_sugar(){
        double calcular_sugar = azucar * 250 / 10;
        return (azucar*litros/g);
    }
    
     public String Temp(){
         if(agua == false){
            System.out.println("ADVERTENCIA: NO ES AGUA");
         }else if(calcular_TM() <= 10){
            System.out.println("BEBIDA FRIA");
        }else if(calcular_TM() >= 70){
            System.out.println("BEBIDA CALIENTE");
        }else if(calcular_sugar() >= 50.4){
             System.out.println("----ADVERTENCIA: BEBIDA CON EXCESO DE AZUCAR.----");
        }else{
            
        }
        return null;   
    }
    
    public void imprimir_Agua(){
        
        calcular_TM();
        Temp();
        super.Imprimir_Pro();
        System.out.println("Tipo: "+ tipo_agua);
        System.out.println("Es agua: "+ agua);
    }
}