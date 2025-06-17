public class Biblioteca {

    Material[] materiales;

    public Biblioteca(int capacidad) {
        materiales = new Material[capacidad];
    }

    public boolean agregarMaterial(Material material) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = material;
                return true;
            }
        }
        return false;
    }



        public int contarLibros() {
        int contador = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] instanceof Libro) {
                contador++;
            }
        }
        return contador;


        }

    public int contarRevistas() {
        int contador = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] instanceof Revista) {
                contador++;
            }
        }
        return contador;


    }









}



