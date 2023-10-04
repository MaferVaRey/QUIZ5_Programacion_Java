/**
 * Clase biblioteca: Crea los métodos relacionados a la biblioteca:
 * Registrar libros, buscar un libro, mostrar los libros disponibles.
 *
 * Complejidad temporal: O(N) Complejidad lineal
 */

import java.util.LinkedList;
public class Bilbioteca {

    /**
     * Atributo de la clase:
     * Libros disponibles: LinkedList que almacena los libros registrados.
     */
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**
     *Constructor de la clase
     *
     * @param librosDisponibles: LinkedList que guarda los libros disponibles
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public Bilbioteca(LinkedList<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    /**
     * buscarLibro: busca dentro de la lista los libros que haya disponibles
     * ya almacenados
     * @param titulo: titulo del libro almacenado en la lista.
     * @return: Si existe: libro buscado. Si no existe: null.
     *
     * Complejidad temporal: O(1) complejidad constante
     */
    public Libro buscarLibro(String titulo){

        for(int i = 0; i < librosDisponibles.size(); i++){
            Libro libroAux = librosDisponibles.get(i);
            if (libroAux.getTitulo().equals(titulo)){
                return libroAux;
            }
        }
        return null;
    }

    /**
     * resgitrarLibro: Almacena un nuevo libro dentro de la lista de la
     * biblioteca
     *
     * @param libro: objeto de la clase Libro que se añadirá a la biblioteca
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**
     * mostrarLibrosDisponibles: Muestra los libros contenidos en la lista (biblioteca)
     *
     * @return: la lista de libros en la lista biblioteca.
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles(){
        return librosDisponibles;
    }
}