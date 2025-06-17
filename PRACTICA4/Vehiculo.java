public abstract class Vehiculo {


    private String placa;
    private double capacidadCarga;


    public Vehiculo (String placa, double capacidadCarga) {
        this.placa = placa;
        this.capacidadCarga = capacidadCarga;

    }





    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
