public class Objetos extends Material {
    String namObj;
    public Objetos(int red, int green, int azul, String desc, String namObj){
        super(red, green, azul, desc);  
        this.namObj = namObj;
    }
    public void infObject(){
        System.out.println("El  objeto es un/una " + namObj +" de color " 
                + getColor()+ " y su material es de " + getDesc());
    }
}
