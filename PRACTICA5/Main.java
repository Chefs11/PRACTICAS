public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(5);

        Libro libro1 = new Libro();
        libro1.setTitulo("Principito1");
        libro1.setIsbn("ABCD12");

        Libro libro2 = new Libro();
        libro2.setTitulo("Principito2");
        libro2.setIsbn("ABCD13");

        Libro libro3 = new Libro();
        libro3.setTitulo("Principito3");
        libro3.setIsbn("ABCD14");

        Libro libro4 = new Libro();
        libro4.setTitulo("Principito4");
        libro4.setIsbn("ABCD15");

        Libro libro5 = new Libro();
        libro5.setTitulo("Principito5");
        libro5.setIsbn("ABCD16");

        System.out.println(); biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        biblioteca.prestar("ABCD12", "Alan Salgado");
        biblioteca.prestar("ABCD15", "Emiliano Velazques");

        biblioteca.devolver("ABCD12");



    }
}
