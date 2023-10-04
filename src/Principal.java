import java.util.LinkedList;

/**
 * Clase principal: Ejecución principal del programa
 * Se crean objetos de las clases 'libro' y 'biblioteca'
 *
 * Complejidad temporal: O(1) Complejidad constante
 */
public class Principal {

    public static void main(String[] args) {

        LinkedList<Libro> BibliotecaKonradLorenz = new LinkedList<Libro>();
        Bilbioteca bilbioteca = new Bilbioteca(BibliotecaKonradLorenz);
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);
    }
}
