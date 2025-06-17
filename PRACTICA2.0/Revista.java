public class Revista extends  Material{

    private int numeroEdicion;

    public int getNumeroEdicion() {
        return numeroEdicion;
    }


    //GETTERS AND SETTERS
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Revista (String titulo, String autor, int numeroEdicion) {
        super (titulo, autor);
        this.numeroEdicion = numeroEdicion;



    }
}
