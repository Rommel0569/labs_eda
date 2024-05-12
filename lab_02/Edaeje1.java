package edaeje1; import java.util.*;
public class Edaeje1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese su base");
                int base= scan.nextInt();

                if (base > 0 ){
                    trianguloRecursivo(base);
                }
    }   
        
    public static void trianguloRecursivo(int base) {

        if (base <= 0) {
            return;
        }
        
        trianguloRecursivo(base - 1);
        
        for (int i = 0; i < base; i++) { 
            System.out.print("*");
        }
        System.out.println(); 
    }
}