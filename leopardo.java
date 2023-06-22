public class leopardo extends felinos{
public leopardo(){
    super();

}
    String colorL;
    String vivienda;

    public leopardo(String nombre, String tamanio, String tipo, String color, String peso, String edad, String colorL, String vivienda) {
        super(nombre, tamanio, tipo, color, peso, edad);
        this.colorL = colorL;
        this.vivienda = vivienda;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public void vivienda(){
        System.out.println("el leopardo vive en zonas calidas");
    }


}
