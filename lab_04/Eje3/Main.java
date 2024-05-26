import java.util.*;
public class Main {
static List<Turista<?>> lisTuristas = new ArrayList<>();

    public static void main(String[] args) {
        registrarTurista("Rommel", "Chambi", 20220569);
        registrarTurista("Ower", "Lopez", "2024AxZ");
        registrarTurista("Max", "Soncco", 20220879);

    }
    
    public static <T> void registrarTurista(String nombre, String apellido, T docIdent) {
        Turista<T> turista = new Turista<>(nombre, apellido, docIdent);
        lisTuristas.add(turista);
        System.out.println("Turista registrado: " + nombre + " " + apellido + ", Documento: " + docIdent);
    }   
}
