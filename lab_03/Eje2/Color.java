public class Color {
    private int red;
    private int green;
    private int blue;
    public Color(int red, int green, int blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }
    public String getColor(){
        if (red == 255 && green == 0 && blue == 0) {
            return "Rojo";
        } else if (red == 0 && green == 255 && blue == 0) {
            return "Verde";
        } else if (red == 0 && green == 0 && blue == 255) {
            return "Azul";
        } else if (red == 255 && green == 255 && blue == 0) {
            return "Amarillo";
        } else if (red == 255 && green == 0 && blue == 255) {
            return "Magenta";
        } else if (red == 0 && green == 255 && blue == 255) {
            return "Cian";
        } else if (red == 255 && green == 255 && blue == 255) {
            return "Blanco";
        } else if (red == 0 && green == 0 && blue == 0) {
            return "Negro";
        }
        return "Color desconocido";
    } 
}
