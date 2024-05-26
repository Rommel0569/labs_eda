import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        String operando1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo numero: ");
        String operando2 = scanner.nextLine();
        
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.nextLine();

        Number num1 = Double.parseDouble(operando1);
        Number num2 = Double.parseDouble(operando2);

        double r;
        switch (operacion) {
            case "+":
                r= Operacion.sumar(num1, num2);
                break;
            case "-":
                r= Operacion.restar(num1, num2);
                break;
            case "*":
                r= Operacion.multiplicar(num1, num2);
                break;
            case "/":
                r= Operacion.dividir(num1, num2);
                break;   
            default:
                System.out.println("Operación inválida.");
                return;
        }

        System.out.print("Resultado: " + r);
        System.out.println(" ");
    }
}