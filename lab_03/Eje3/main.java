public class main {
    public static void main(String []args){
     Ganso g1 = new Ganso(3, 10,"graznido", "nado", "blanco", 10, 2, 2,4, "chen");
     g1.mostrarInfo();
     System.out.println(" ");
     
     Pato p1 = new Pato(2, 6, "Cua, cua , cua", "volar", "blanco", 10, 4, 2, "agua fresca", 10);
     p1.mostrarInfo();
     System.out.println(" ");
         
     Gallina ga1= new Gallina(2, 7, "Co, co co ", "volar", "mixto", 9, 2, 2, 30, "brahma", "azul");
     ga1.mostrarInfo();
     System.out.println(" ");
    }
}
