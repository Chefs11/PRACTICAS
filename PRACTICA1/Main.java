import javax.swing.*;
public class Main {

    public static void main(String[] args) {

        AutoLujo AutoLujo = new AutoLujo ("20243dr", "Audi R8", 100000, 15000);
        AutoEconomico AutoEco = new AutoEconomico("20243ds", "Audi s3", 150000, 30000);

        System.out.println("");
        System.out.println("Modelo: " + AutoLujo.getModelo());
        System.out.println("Placa: " + AutoLujo.getPlaca());
        System.out.println("Costo Basse: " + AutoLujo.getCostoBase());
        System.out.println("Costo con impuesto: " + AutoLujo.calcularCostoFinal());
        System.out.println("");


        System.out.println("");
        System.out.println("Modelo: " + AutoEco.getModelo());
        System.out.println("Placa: " + AutoEco.getPlaca());
        System.out.println("Costo Base: " + AutoEco.getCostoBase());
        System.out.println("Costo con descuento: " + AutoEco.calcularCostoFinal());
        System.out.println("");


    }
}
