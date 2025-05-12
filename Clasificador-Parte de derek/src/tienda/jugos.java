/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Derek
 */
public class jugos extends productos{
    private String sabor;
    private boolean pulpa;
    private double azucar;
    private double litros;
    private double g;
    
    public jugos(){
        super();
        this.sabor = "SIN SABOR";
        this.pulpa = false;
        this.azucar = 0.0;
    }
    
    public jugos(String nombre,String sabor,String marca,boolean pulpa,int precio,double azucar,int inventario) {
        super(nombre, marca, precio, inventario);
        this.sabor = sabor;
        this.pulpa = pulpa;
        this.azucar = azucar;
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
   
    public boolean isPulpa() {
        return pulpa;
    }

    public void setPulpa(boolean pulpa) {
        this.pulpa = pulpa;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
     public double calcular_sugar(){
        double azucar = 250 / 10;
        return (litros/g);
    }
    
    public String calcular_Jugo_Pulpa(){
        if(pulpa == false){
            System.out.println("NO TIENE PULPA");
        }else if(calcular_sugar() >= 50.4){
        System.out.println("----ADVERTENCIA: BEBIDA CON EXCESO DE AZUCAR.----");
        }else if(azucar >=50.4){
        System.out.println("ADVERTENCIA: EXCESO DE AZUCAR");  
        }return null;
    }
    
    public void Imprimir_Jugos(){
        calcular_Jugo_Pulpa();
        calcular_sugar();
        super.Imprimir_Pro();
        System.out.println("Sabor: "+ sabor);
        System.out.println("¿Tiene Pulpa?: "+ pulpa);
        System.out.println("Azucar: "+ azucar);
        
    }
    
    
     

    
}
