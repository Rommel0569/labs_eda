public class Ganso extends Ave{
    private int esperanzaVida;
    private String tipoGanzo;
    
    public Ganso(int longP, int longA, String son, String hab, String colPl, int peso
            , int edad, int patas, int espVida, String tipo){
        super(longP, longA, son, hab, colPl, peso, edad, patas);
        esperanzaVida=espVida;
        tipoGanzo=tipo;
    }
    public int getEspVida(){
        return esperanzaVida;
    }
    public String getTipGanzo(){
        return tipoGanzo;
    }
    public void mostrarInfo(){
        System.out.println("El ganzo tiene " + getPatas() + " patas, pesa "+ getPeso() 
                + " kg, tiene " + getEdad()  + " años de vida, suelen vivir " + esperanzaVida 
                + " años. \n La longitud de su pico es " + getLongPico() 
                + " cm, además la longitud de sus alas es " + getLongAlas() 
                + "cm ; \n el sonido que emiten es un \n" 
                + getSon() + ", su habilidad es " + getHab() 
                + ".Por otro lado, \n el color de sus plumas es " 
                + getColPlu() + " y el tipo de ganzo al que pertenece es " + tipoGanzo +"." );
    }
}
