public class AutoLujo extends Vehiculo {

    private double impuestoLujo;

    public AutoLujo(String placa, String modelo, double costoBase, double impuestoLujo) {
        super(placa, modelo, costoBase);
        this.impuestoLujo = impuestoLujo;
    }

    public double calcularCostoFinal() {
        return getCostoBase() + impuestoLujo;
    }
}
