public class Nodo<T extends Character> {
    T valor;
    Nodo<T> izquierdo, derecho;
    public Nodo(T item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

