package eje2eda; import java.util.*;
public class Eje2eda {

    public static void main(String[] args) {
        
        int []A= ingresarValores();
        int []Aiz= rotarIzquierdaArray(A);
        
        System.out.print("A=[");
        imprimirArray(A);
        System.out.print("] -> Aiz=[");
        imprimirArray(Aiz);
        System.out.println("]");
    }
    public static int[] rotarIzquierdaArray(int[] A){
            Scanner scan = new Scanner(System.in);
            int []Aiz = new int [A.length];
            
            System.out.print("Ingrese la posición: ");
            int pos = scan.nextInt();
            
            if( pos <0 || pos > A.length){
                System.out.println("Ingrese correctamente la posición");
                return null;
            }
            else{
                    int y=0;
                    for(int i=pos;i<A.length;i++){
                        Aiz[y]=A[i];
                        y++;
                    }
            
                    for(int i=0;i<pos;i++){
                        Aiz[y]=A[i];
                        y++;
                    }
                    return Aiz;
            }
     }
         
    public static int[] ingresarValores(){
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
            return num;
    }
         
    public static void imprimirArray(int []Array){
             for (int p: Array){
                 System.out.print(" "+ p);
             }
    }
}