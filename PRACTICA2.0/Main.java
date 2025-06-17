public class Main {
     public static void main(String[] args) {

Biblioteca biblioteca = new Biblioteca(5);
Libro Material1 = new Libro("El principito", "Alan", 250);
Libro Material2 = new Libro("Los dragones", "Julian", 600);
Libro Material3 = new Libro("El iphone", "Valentina", 300);
Revista Material4 = new Revista("Top 5 cantantes", "Vogue", 1);
Revista Material5 = new Revista("Top 5 famosos", "Vogue", 12);
Revista Material6 = new Revista("Top 5 idoitas", "juli", 4);

biblioteca.agregarMaterial(Material1);
biblioteca.agregarMaterial(Material2);
biblioteca.agregarMaterial(Material3);
biblioteca.agregarMaterial(Material4);
biblioteca.agregarMaterial(Material5);
biblioteca.agregarMaterial(Material6);

System.out.println("Lista de materiales:");
System.out.println("Libros");
System.out.println("Titulos de los libros:");
System.out.println( Material1.getTitulo() + ", " + Material2.getTitulo()  + ", "+  Material3.getTitulo());
System.out.println("Autores");
System.out.println(Material1.getAutor() + ", "+ Material2.getAutor()+ ", " + Material3.getAutor());
System.out.println("Paginas");
System.out.println(Material1.getNumeroPaginas() + ", "+ Material2.getNumeroPaginas()+ ", " + Material3.getNumeroPaginas());
          System.out.println(" ");
          System.out.println("Revistas");
          System.out.println("Titulos de los revistas:");
          System.out.println(Material4.getTitulo() + ", " + Material5.getTitulo());
          System.out.println("Autores");
          System.out.println(Material4.getAutor() + ", "+ Material5.getAutor());
          System.out.println("Edicion");
          System.out.println(Material4.getNumeroEdicion() + ", "+ Material5.getNumeroEdicion());



     }
}
