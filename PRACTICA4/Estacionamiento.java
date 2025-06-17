public class Estacionamiento {

    private Vehiculo[] vehiculos;

    public Estacionamiento(int capaciad) {
        vehiculos = new Vehiculo [capaciad];

    }


    public boolean estacionar(Vehiculo v) {
        for (int i = 0; i<vehiculos.length; i ++) {
            if(vehiculos[i] == null){
                vehiculos[i] = v;
                return true;
            }
        } return false;

    }


    public boolean retitar(Vehiculo v) {
        for (int i = 0; i<vehiculos.length; i ++) {
            if (vehiculos[i] !=null) {
                vehiculos[i] = null;
                return true;
            }
        }
        return false;
    }


    public double capacidadTotal(){
        int contador = 0;
        for (int i = 0; i<vehiculos.length; i ++) {
            if (vehiculos[i] != null) {
                contador++;
            }
        }
        return contador;
    }



}
