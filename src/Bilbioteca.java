import java.util.LinkedList;
public class Bilbioteca {

    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    public Libro buscarLibro(String titulo){

        for(int i = 0; i < librosDisponibles.size(); i++){
            Libro libroAux = librosDisponibles.get(i);
            if (libroAux.getTitulo().equals(titulo)){
                return libroAux;
            }
        }
        return null;
    }
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    public LinkedList<Libro> mostrarLibrosDisponibles(){
        return librosDisponibles;
    }
}
