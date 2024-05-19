public class Ave {
    private int longPico;
    private int longAlas;
    private String sonido;
    private String habilidad;
    private String colorPlumaje;
    private int peso;
    private int edad;
    private int patas;
    
    public Ave(int longP, int longA, String son, String hab, String colPl
            , int peso, int edad, int patas){
        longPico = longP;
        longAlas = longA;
        sonido=son;
        habilidad=hab;
        colorPlumaje = colPl;
        this.peso=peso;
        this.edad=edad;
        this.patas=patas;
    }
    public int getLongPico(){
        return longPico;
    }
    public int getLongAlas(){
        return longAlas;
    }
    public String getSon(){
        return sonido;
    }
    public String getHab(){
        return habilidad;
    }
    public String getColPlu(){
        return colorPlumaje;
    }
    public int getPeso(){
        return peso;
    }
    public int getEdad(){
        return edad;
    }
    public int getPatas(){
        return patas;
    }
}
