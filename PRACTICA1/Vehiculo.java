public  abstract class Vehiculo {

    private String placa;
    private String modelo;
    private double costoBase;




   //CONSTRUCTOR
    public Vehiculo(String placa, String modelo, double costoBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.costoBase = costoBase;
    }

    public abstract  double calcularCostoFinal();

    //GETTER AND SETTER---------------------------
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getCostoBase() {
        return costoBase;
    }
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    //GETTER AND SETTER---------------------------
}



