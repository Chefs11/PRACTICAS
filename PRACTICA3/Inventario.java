public class Inventario {


    private Producto [] productos;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
    }

        public boolean agregarProducto(Producto producto) {
        for (int i= 0; i < productos.length; i ++) {
            if (productos[i] == null) {
                productos[i] = producto;
                return true;
            }
        }
        return false;
        }


        public int contarPerecederos() {
        int contador = 0;
        for (int i= 0; i < productos.length; i ++) {
            if (productos[i] instanceof ProductoPerecedero) {
                contador ++;
            }
        } return contador;
        }

}
