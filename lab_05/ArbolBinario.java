import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class ArbolBinario<T extends Character> {
    private Nodo<T> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(T valor) {
        raiz = insertarNodo(raiz, valor);
        imprimirArbol();
        imprimirOrdenes();
    }

    private Nodo<T> insertarNodo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            nodo = new Nodo<>(valor);
            return nodo;
        }
        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = insertarNodo(nodo.derecho, valor);
        }
        return nodo;
    }

    public Nodo<T> buscar(T valor) {
        return buscarNodo(raiz, valor);
    }

    private Nodo<T> buscarNodo(Nodo<T> nodo, T valor) {
        if (nodo == null || nodo.valor.equals(valor)) {
            return nodo;
        }
        if (nodo.valor.compareTo(valor) < 0) {
            return buscarNodo(nodo.derecho, valor);
        }
        return buscarNodo(nodo.izquierdo, valor);
    }

    public T minimo() {
        return valorMinimo(raiz);
    }

    private T valorMinimo(Nodo<T> nodo) {
        T minv = nodo.valor;
        while (nodo.izquierdo != null) {
            minv = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return minv;
    }

    public T maximo() {
        return valorMaximo(raiz);
    }

    private T valorMaximo(Nodo<T> nodo) {
        T maxv = nodo.valor;
        while (nodo.derecho != null) {
            maxv = nodo.derecho.valor;
            nodo = nodo.derecho;
        }
        return maxv;
    }

    public Nodo<T> predecesor(T valor) {
        Nodo<T> current = buscar(valor);
        if (current == null) return null;

        if (current.izquierdo != null) {
            return buscarMaximo(current.izquierdo);
        }

        Nodo<T> predecesor = null;
        Nodo<T> ancestor = raiz;
        while (ancestor != current) {
            if (current.valor.compareTo(ancestor.valor) > 0) {
                predecesor = ancestor;
                ancestor = ancestor.derecho;
            } else {
                ancestor = ancestor.izquierdo;
            }
        }
        return predecesor;
    }

    public Nodo<T> sucesor(T valor) {
        Nodo<T> current = buscar(valor);
        if (current == null) return null;
        if (current.derecho != null) {
            return buscarMinimo(current.derecho);
        }
        Nodo<T> successor = null;
        Nodo<T> ancestor = raiz;
        while (ancestor != current) {
            if (current.valor.compareTo(ancestor.valor) < 0) {
                successor = ancestor;
                ancestor = ancestor.izquierdo;
            } else {
                ancestor = ancestor.derecho;
            }
        }
        return successor;
    }

    public void eliminar(T valor) {
        raiz = eliminarNodo(raiz, valor);
        System.out.println("Árbol después de la eliminación:");
        imprimirArbol();
        imprimirOrdenes();
    }

    private Nodo<T> eliminarNodo(Nodo<T> nodo, T valor) {
        if (nodo == null) return nodo;

        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = eliminarNodo(nodo.izquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecho = eliminarNodo(nodo.derecho, valor);
        } else {
            // Caso 1: Nodo con un solo hijo o sin hijos
            if (nodo.izquierdo == null)
                return nodo.derecho;
            else if (nodo.derecho == null)
                return nodo.izquierdo;

            // nodo con dos hijos
            nodo.valor = valorMinimo(nodo.derecho);
            nodo.derecho = eliminarNodo(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    private Nodo<T> buscarMinimo(Nodo<T> nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }

    private Nodo<T> buscarMaximo(Nodo<T> nodo) {
        while (nodo.derecho != null) {
            nodo = nodo.derecho;
        }
        return nodo;
    }

    private void mostrarEnOrden(Nodo<T> nodo) {
        if (nodo != null) {
            mostrarEnOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            mostrarEnOrden(nodo.derecho);
        }
    }

    private void mostrarPreOrden(Nodo<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            mostrarPreOrden(nodo.izquierdo);
            mostrarPreOrden(nodo.derecho);
        }
    }

    private void mostrarPostOrden(Nodo<T> nodo) {
        if (nodo != null) {
            mostrarPostOrden(nodo.izquierdo);
            mostrarPostOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    public void imprimirOrdenes() {
        System.out.print("Recorrido en inorden: ");
        mostrarEnOrden(raiz);
        System.out.println();
        System.out.print("Recorrido en preorden: ");
        mostrarPreOrden(raiz);
        System.out.println();
        System.out.print("Recorrido en postorden: ");
        mostrarPostOrden(raiz);
        System.out.println();
    }

    public void imprimirArbol() {
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Arbol Binario de Busqueda");
        graph.setAttribute("ui.stylesheet", "node { text-alignment: center; text-size: 20; }");
        graph.setStrict(false);
        graph.setAutoCreate(true);
        agregarNodosAlGrafo(graph, raiz);
        graph.setAttribute("ui.layout", "tree");
        graph.display();
    }

    private void agregarNodosAlGrafo(Graph graph, Nodo<T> nodo) {
        if (nodo != null) {
            String nodeId = "n" + (int) nodo.valor; // Prefijo 'n' para evitar conflictos
            Node node = graph.addNode(nodeId);
            node.setAttribute("ui.label", nodo.valor.toString());

            if (nodo.izquierdo != null) {
                String izquierdoId = "n" + (int) nodo.izquierdo.valor;
                Node izquierdo = graph.addNode(izquierdoId);
                izquierdo.setAttribute("ui.label", nodo.izquierdo.valor.toString());
                graph.addEdge(nodeId + "-" + izquierdoId, nodeId, izquierdoId, true);
                agregarNodosAlGrafo(graph, nodo.izquierdo);
            }

            if (nodo.derecho != null) {
                String derechoId = "n" + (int) nodo.derecho.valor;
                Node derecho = graph.addNode(derechoId);
                derecho.setAttribute("ui.label", nodo.derecho.valor.toString());
                graph.addEdge(nodeId + "-" + derechoId, nodeId, derechoId, true);
                agregarNodosAlGrafo(graph, nodo.derecho);
            }
        }
    }
}
