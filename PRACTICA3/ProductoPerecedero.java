public class ProductoPerecedero extends Producto {

    private String fechaDeCaducidad;

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }


    public ProductoPerecedero(String codigo, String nombre, String fechaDeCaducidad) {
        super(codigo,nombre); {
            this.fechaDeCaducidad = fechaDeCaducidad;
        }

    }


    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
}
