package EDALAB03;
import java.util.*;
public class main {
    public static void main(String[] args) {
        int edad;
        String nombre;
        Scanner sc = new Scanner(System.in);
        Alumno A2 = new Alumno();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese su Nombre: ");
        nombre = sc.nextLine();

        A2.setEdad(edad);
        A2.setName(nombre);
        A2.getEdad();
        A2.getName();
    }
}
