public class ProductoNoPerecedero extends Producto {

    private int garantiaMeses;

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public ProductoNoPerecedero (String codigo, String nombre, int garantiaMeses) {
        super (codigo, nombre); {
            this.garantiaMeses = garantiaMeses;
        }
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}


