public class Camion extends Vehiculo{

    private int numEjes;


    public Camion (String placa, double capacidadCarga, int numEjes) {
        super (placa, capacidadCarga);
        this.numEjes = numEjes;
    }




    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
