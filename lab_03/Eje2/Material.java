public class Material extends Color{
    String descripcion;
    public Material(int red, int green, int azul, String desc){
        super(red, green, azul);
        descripcion= desc;
    }
    public String getDesc(){
        return descripcion;
    }
}
