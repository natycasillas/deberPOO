

public class leon extends felinos {

    public  leon() {
        super();
    }

    String GarrasL;
    String tamanioL;

    public leon( String nombre, String tamanio, String tipo, String color, String peso, String edad, String garrasL, String tamanioL) {
        super(nombre, tamanio, tipo, color, peso, edad);
        GarrasL = garrasL;
        this.tamanioL = tamanioL;
    }

    public String getGarrasL() {
        return GarrasL;
    }

    public void setGarrasL(String garrasL) {
        GarrasL = garrasL;
    }

    public String getTamanioL() {
        return tamanioL;
    }


    public void setTamanioL(String tamanioL) {
        this.tamanioL = tamanioL;
    }


}
