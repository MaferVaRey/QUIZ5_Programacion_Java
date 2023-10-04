/**
 * Clase libro: Crea los atributos y métodos relacionados a los libros
 * que van a ser posteriormente contenidos en la(s) biblioteca(s).
 * métodos: Getters y Setters de los atributos
 *
 * Complejidad temporal: O(1) Complejidad constante
 */
public class Libro {

    /**
     * Atributos de la clase:
     * titulo: titulo del libro
     * autor: autor del libro
     * numeroPaginas: número de páginas del libro.
     */
    private String titulo, autor;
    private int numeroPaginas;


    /**
     * Construcor de la clase:
     *
     * @param titulo: Almacena el nombre del titulo del libro
     * @param autor: Almacena el nombre del autor del libro
     * @param numeroPaginas: Almacena la cantidad depáginas del libro
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * SETTERS & GETTERS de los atributos de la clase:
     *
     * Usadospara obtener lo almacenada con respecto a ese atributo de la clase
     * y para guardar un nuevodato con ese mismo atributo
     *
     * @return: el atributo al que hacen referencia
     *
     * Complejidad temporal: O(1) Complejidad constante
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}