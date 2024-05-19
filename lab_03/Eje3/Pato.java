public class Pato extends Ave{
    private String tipoHabitad;
    private int capacidad;
    
    public Pato(int longP, int longA, String son, String hab, String colPl, int peso
            , int edad, int patas, String tipHab, int cap){
        super(longP, longA, son, hab, colPl, peso, edad, patas);
        tipoHabitad = tipHab;
        capacidad = cap;
    }
    public String getTipHab(){
        return tipoHabitad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void mostrarInfo(){
        System.out.println("El pato tiene " + getPatas() + " patas, pesa "+ getPeso() 
                + " kg, tiene " + getEdad()  + " años de vida, su tipo de habitad es \n" 
                + tipoHabitad + ". La longitud de su pico es " 
                + getLongPico() + " cm, además la longitud de sus alas es " + getLongAlas() 
                + " cm; \n el sonido que emiten es un " + getSon() + ", su habilidad es " 
                + getHab() + ".\n Por otro lado, el color de sus plumas es " + getColPlu() 
                + " y su capacidad para el nado en metros es " 
                + capacidad + " metros.");
    }
}
