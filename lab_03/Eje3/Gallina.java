public class Gallina extends Ave {
    private int cantHuevos;
    private String tipoGallina;
    private String colorHuevo;
    public Gallina(int longP, int longA, String son, String hab, String colPl, int peso
            , int edad, int patas, int cantHuev, String tipGall, String colHue){
        super(longP, longA, son, hab, colPl, peso, edad, patas);
        cantHuevos=cantHuev;
        tipoGallina = tipGall;
        colorHuevo = colHue;
    }
    public int getCantHuev(){
        return cantHuevos;
    }
    public String getTipoGallina(){
        return tipoGallina;
    }
    public String getColorHuevo(){
        return colorHuevo;
    }
    public void mostrarInfo(){
        System.out.println("La gallina tiene " + getPatas() + " patas, pesa "+ getPeso() 
          + " kg, tiene " 
          + getEdad()  + " años de vida, el tipo de gallina al que pertenece es \n" 
          + tipoGallina + ", además la cantidad de huevos promedio que pone a la semana este tipo es " 
          + cantHuevos +" en total. \n La longitud de su pico es " + getLongPico() 
          + " cm,  además la longitud de sus alas es " 
          + getLongAlas() + "; \n el sonido que emiten es un " + getSon() + ", su habilidad es " 
          + getHab() + ". Por otro lado, \n el color de sus plumas es " + getColPlu() 
          + " y el color de huevos que producen es " 
          + colorHuevo + "." );
    }
}
