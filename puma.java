public class puma extends felinos {

    public puma(){
        super();

    }
    String pelajeL;
    String tamaniOp;

    public puma(String nombre, String tamanio, String tipo, String color, String peso, String edad, String pelajeL, String tamaniOp) {

        super(nombre, tamanio, tipo, color, peso, edad);
        this.pelajeL = pelajeL;
        this.tamaniOp = tamaniOp;
    }

    public String getPelajeL() {
        return pelajeL;
    }

    public void setPelajeL(String pelajeL) {
        this.pelajeL = pelajeL;
    }

    public String getTamaniOp() {
        return tamaniOp;
    }

    public void setTamaniOp(String tamaniOp) {
        this.tamaniOp = tamaniOp;
    }

    public void leonl(){
        System.out.println("Esta es el metodo leon");
    }

}
