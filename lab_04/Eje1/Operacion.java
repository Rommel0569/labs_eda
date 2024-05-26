public class Operacion<T extends Number> {
    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double restar(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> double multiplicar(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double dividir(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
