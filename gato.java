public class gato  extends felinos{

    public gato(){

    }

    String pelaje;
    String vivienda;

    public gato(String nombre, String tamanio, String tipo, String color, String peso, String edad, String pelaje, String vivienda) {
        super(nombre, tamanio, tipo, color, peso, edad);
        this.pelaje = pelaje;
        this.vivienda = vivienda;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public void pelajeG(){
        System.out.println("esta es el metodo pelage g");
    }




}
