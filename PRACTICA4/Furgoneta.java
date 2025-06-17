public class Furgoneta extends Vehiculo{

    private boolean tieneRefaccion;

   public Furgoneta  (String placa, double capacidadCarga, boolean tieneRefaccion){
       super(placa, capacidadCarga);
       this.tieneRefaccion = tieneRefaccion;
   }





    public boolean isTieneRefaccion() {
        return tieneRefaccion;
    }
    public void setTieneRefaccion(boolean tieneRefaccion) {
        this.tieneRefaccion = tieneRefaccion;
    }
}
