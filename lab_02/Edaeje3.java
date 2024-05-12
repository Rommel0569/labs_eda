package edaeje3; import java.util.*;
public class Edaeje3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantos valores quiere ingresar ?");
        int cantValores =scan.nextInt();
        int[] num = new int [cantValores];
        
        System.out.println("Ingrese su valores");
        for (int i=0;i<cantValores;i++) {
            System.out.print("Nro" + (i+1) + ":");
            int numeros = scan.nextInt(); 
            num[i]= numeros;
        }
        
        int Ain [] = invertirArray(num);
        System.out.println("Arreglo Original: " + Arrays.toString(num));
        System.out.println("Arreglo Invertido: " + Arrays.toString(Ain));
 }
    public static int[] invertirArray(int []A){
        int []Ain=new int [A.length];
                for (int i = 0; i<A.length ;i++){
                    Ain[i] = A[A.length -1 -i];
                }
        return Ain;
    }
}

