public class Main {
    public static void main(String[] args) {

        Estacionamiento estacionamiento = new Estacionamiento(6);

        Camion Vehiculo1 = new Camion("ABC123", 20, 12);
        Camion Vehiculo2 = new Camion("ABC456", 30, 7);
        Camion Vehiculo3 = new Camion("ABC789", 20, 12);
        Camion Vehiculo4 = new Camion("ABC123", 20, 12);
        Camion Vehiculo5 = new Camion("ABC456", 30, 7);
        Furgoneta Vehiculo6 = new Furgoneta("ABDA78", 30, true);
        Furgoneta Vehiculo7 = new Furgoneta("ABDA789", 25, false);

        estacionamiento.estacionar(Vehiculo1);
        estacionamiento.estacionar(Vehiculo2);
        estacionamiento.estacionar(Vehiculo3);
        estacionamiento.estacionar(Vehiculo4);
        estacionamiento.estacionar(Vehiculo5);
        estacionamiento.estacionar(Vehiculo6);
        estacionamiento.estacionar(Vehiculo7);

        System.out.println("Cpacidad: " + estacionamiento.capacidadTotal());
        System.out.println("Retirar Carro");
        estacionamiento.retitar(Vehiculo1);

        System.out.println("Capacidad: " +estacionamiento.capacidadTotal());







    }
}
