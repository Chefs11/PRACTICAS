public class AutoEconomico extends Vehiculo{

    private double descuentoEco;

    public AutoEconomico(String placa, String modelo, double costoBase, double descuentoEco) {
        super(placa, modelo, costoBase);
        this.descuentoEco = descuentoEco;
    }
    public double calcularCostoFinal() {
        return getCostoBase() - descuentoEco;

    }
}
