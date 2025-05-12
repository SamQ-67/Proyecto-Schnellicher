/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Derek
 */
public class energeticas extends productos{
    private String sabor;
    private double azucar;
    private double cafeina;
    private double taurina;
    private double hidratos_ca;
    private double mg;
    private double ml;
    private double g;
    private double mol;
    protected double gr_alcohol;
    protected double volumen;
    protected double litros;
    protected int edad;

    public energeticas(){
        super();
        this.sabor = "SIN SABOR";
        this.azucar = 0.0;
        this.cafeina = 0.0;
        this.taurina = 0.0;
        this.hidratos_ca = 0.0;
        this.mg = 0.0;
        this.ml = 0.0;
        this.g = 0.0;
        this.mol = 0.0;
        this.gr_alcohol = 0.0;
        this.volumen = 0.0;
        this.litros = 0.0;
        this.edad = 0;
    }
    
    public energeticas( String nombre, String marca, String sabor,int precio, int inventario, int edad, double gr_alcohol,double litros, double azucar, double cafeina, double taurina, double hidratos_ca) {
        super(nombre, marca, precio, inventario);
        this.sabor = sabor;
        this.azucar = azucar;
        this.cafeina = cafeina;
        this.taurina = taurina;
        this.hidratos_ca = hidratos_ca;
        this.gr_alcohol = gr_alcohol;
        this.litros = litros;
        this.edad = edad;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public double getCafeina() {
        return cafeina;
    }

    public void setCafeina(double cafeina) {
        this.cafeina = cafeina;
    }

    public double getTaurina() {
        return taurina;
    }

    public void setTaurina(double taurina) {
        this.taurina = taurina;
    }

    public double getHidratos_ca() {
        return hidratos_ca;
    }

    public void setHidratos_ca(double hidratos_ca) {
        this.hidratos_ca = hidratos_ca;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getMol() {
        return mol;
    }

    public void setMol(double mol) {
        this.mol = mol;
    }

    public double getGr_alcohol() {
        return gr_alcohol;
    }

    public void setGr_alcohol(double gr_alcohol) {
        this.gr_alcohol = gr_alcohol;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public double calcular_COFFE(){
        double calcular_COFFE = cafeina * 250.0 / 30.0;
        return (cafeina*litros/mg);   
    }
    
    public double calcular_sugar(){
        double calcular_sugar = azucar * 250 / 10;
        return (azucar*litros/g);
    }
    
    public double calcular_Tau(){
        double calcular_Tau = taurina * 1000.0 / 250.0;
        return(taurina*mg/litros);
    }
    
    public double calcular_Hidratos(){
        double calcular_Hidratos = hidratos_ca / 15.0;
        return(hidratos_ca/g);
    }
    
    public double calcular_alc(){
       double calcular_alc = 1.89 * gr_alcohol * 0.8 / 100.0;
       return (litros*gr_alcohol*0.8/100.0);
   }
    
    public String calcular_energeticos(){
        if(edad <= 17){
            System.out.println("----PROHIBIDA LA VENTA A MENORES DE EDAD.----");
        }else if(gr_alcohol >= 70.0){
            System.out.println("----ADVERNTENCIA: BEBIDA CON EXCESO DE ALCOHOL.----");
        }else if(azucar >= 50.4){
            System.out.println("----ADVERTENCIA: BEBIDA CON EXCESO DE AZUCAR.----");
        }else if(cafeina >= 200.0){
            System.out.println("----ADVERTENCIA: BEBIDA CON EXCESO DE CAFEINA.----");
        }else if(taurina >= 18.92){
            System.out.println("---ADVERTENCIA: BEBIDA CON EXCESO DE CALORIAS.");
        }else if(hidratos_ca >= 7.4){
            System.out.println("----ADVERTENCIA: BEBIDA CON EXCESO DE CALORIAS.-----");
        }else{
            
        }return null;
    }
   
    public void Imprimir_Energy(){
        calcular_energeticos();
        calcular_Hidratos();
        calcular_sugar();
        calcular_alc();
        calcular_COFFE();
        calcular_Tau();
        super.Imprimir_Pro();
        System.out.println("Edad: "+ edad);
        System.out.println("Sabor: "+ sabor);
        System.out.println("Azucar: "+ azucar);
        System.out.println("Cafeina: "+ cafeina);
        System.out.println("Taurina: "+ taurina);
        System.out.println("Hidratos de carbono: "+ hidratos_ca);
        
        
    }

    
    
}
