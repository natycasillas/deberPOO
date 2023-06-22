public class tigrillo extends felinos{

    public tigrillo(){
        super();
    }
String tamanioT;
    String pelajeT;

    public tigrillo(String nombre, String tamanio, String tipo, String color, String peso, String edad, String tamanioT, String pelajeT) {
        super(nombre, tamanio, tipo, color, peso, edad);
        this.tamanioT = tamanioT;
        this.pelajeT = pelajeT;
    }

    public String getTamanioT() {
        return tamanioT;
    }

    public void setTamanioT(String tamanioT) {
        this.tamanioT = tamanioT;
    }

    public String getPelajeT() {
        return pelajeT;
    }

    public void setPelajeT(String pelajeT) {
        this.pelajeT = pelajeT;
    }


    public void tigrilloC(){
        System.out.println("Este es elñ metodo tigrillo");
    }
}
