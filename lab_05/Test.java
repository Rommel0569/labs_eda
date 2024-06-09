public class Test {
    public static void main(String[] args) {
        ArbolBinario<Character> arbolBinario = new ArbolBinario<>();
        
        // valores ASCII
        arbolBinario.insertar((char) 74); 
        System.out.println(" ");
        arbolBinario.insertar((char) 73); 
        System.out.println(" ");
        arbolBinario.insertar((char) 82); 
        System.out.println(" ");
        arbolBinario.insertar((char) 65);
        System.out.println(" ");
        arbolBinario.insertar((char) 70);
        System.out.println(" ");
        arbolBinario.insertar((char) 65);
        System.out.println(" ");

        // Metodo Busqueda
        Nodo<Character> nodo = arbolBinario.buscar('F');
        System.out.println("Buscar 'P': " + (nodo != null ? "Encontrado" : "No encontrado"));
        System.out.println(" ");
        
        // mínimo y máximo
        System.out.println("Mínimo valor: " + arbolBinario.minimo());
        System.out.println("Máximo valor: " + arbolBinario.maximo());
        System.out.println(" ");
        
        // predecesor 
        Nodo<Character> predecesor = arbolBinario.predecesor('F');
        System.out.println("Predecesor de 'F': " + (predecesor != null ? predecesor.valor : "No tiene"));
        //sucesor
        Nodo<Character> sucesor = arbolBinario.sucesor('J');
        System.out.println("Sucesor de 'J': " + (sucesor != null ? sucesor.valor : "No tiene"));
        System.out.println(" ");
        
        //mostrar arbol
        arbolBinario.imprimirArbol();
        
        // eliminar hoja
        //System.out.println("\nEliminando hoja:");
        //arbolBinario.eliminar('R');
        
        //eliminar padre
        //System.out.println("\nEliminando nodo padre:");
        //arbolBinario.eliminar('I');

        //eliminar raíz
        System.out.println("\nEliminando la raíz:");
        arbolBinario.eliminar('J');

    }
}
