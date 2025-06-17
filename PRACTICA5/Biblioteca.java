public class Biblioteca {

    private Libro [] libros;
    private  String [] usuariosPrestamo;



    public Biblioteca ( int capacidad){
        this.libros = new Libro[capacidad];
        this.usuariosPrestamo = new String[capacidad];

    }
  //AGRGAR UN LIBRO
    public boolean agregarLibro (Libro libro) {
        for (int i= 0; i < libros.length; i ++) {
            if (libros[i] == null) {
                libros[i] = libro; {
                    System.out.println("Libro" +  " " + libro.getTitulo() + " " + "agregado");
                }
                return true;
            }
            {

            }
        }
        return false;

    }


     //PRESTAR UN LIBRIO
    public boolean prestar(String isbn, String usuario) {
        for (int i= 0; i < libros.length; i ++) {
            if (libros[i].getIsbn().equals(isbn)) {
                if (libros[i].isPrestado() ==false) {
                    libros[i].setPrestado(true);
                    usuariosPrestamo[i]=usuario; {
                        System.out.println("Libro: " + libros[i].getIsbn() + " prestado" +  " " + "(" + libros[i].getTitulo() + ")");
                    }
                    return true;
                } else {
                    return false;
                }

            }
        }
        return  false;
    }



        //DEVOLVER UN LIBRO
    public boolean devolver (String isbn) {
        for (int i= 0; i < libros.length; i ++) {
            if (libros[i].getIsbn().equals(isbn) && libros[i].isPrestado() == true) {
                libros[i].setPrestado(false);
                usuariosPrestamo[i]=null; {
                    System.out.println("Libro: " + libros[i].getIsbn() + " devuelto" +  " " + "(" + libros[i].getTitulo() + ")");
                }
                return true;
            }
        }
        return false;
    }


}
