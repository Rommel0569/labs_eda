package EDALAB03;
public class Persona {
    private int edad;
    private String name;

    public Persona() {
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getEdad() {
        System.out.println("Edad: " + edad);
    }
    public void getName() {
        System.out.println("Nombre: " + name);
    }
}