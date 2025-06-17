public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(8);

        ProductoPerecedero Producto1 = new ProductoPerecedero("123" ,"Mantecadas", "11/03/2030");
        ProductoPerecedero Producto2 = new ProductoPerecedero("132" ,"Donitas", "11/04/2030");
        ProductoPerecedero Producto3 = new ProductoPerecedero("321" ,"Negritos", "11/05/2030");
        ProductoPerecedero Producto4 = new ProductoPerecedero("312" ,"Rebanadas", "11/06/2030");
        ProductoNoPerecedero Producto5 = new ProductoNoPerecedero("567", "Iphone", 12);
        ProductoNoPerecedero Producto6 = new ProductoNoPerecedero("765", "Ipad", 18);
        ProductoNoPerecedero Producto7 = new ProductoNoPerecedero("658", "Ipod", 6);
        ProductoPerecedero Producto8 = new ProductoPerecedero("999" ,"Chips", "11/07/2030");


        inventario.agregarProducto(Producto1);
        inventario.agregarProducto(Producto2);
        inventario.agregarProducto(Producto3);
        inventario.agregarProducto(Producto8);
        inventario.agregarProducto(Producto5);
        inventario.agregarProducto(Producto6);
        inventario.agregarProducto(Producto7);
        inventario.agregarProducto(Producto8);







        System.out.println("Cantidad de Productos Perecederos:" + inventario.contarPerecederos());






    }
}
