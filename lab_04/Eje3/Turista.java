class Turista<T> {
    String nombre;
    String apellido;
    T docIdent;

    public Turista(String nombre, String apellido, T docIdent) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.docIdent = docIdent;
    }
}
