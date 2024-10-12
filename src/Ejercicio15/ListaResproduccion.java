package Ejercicio15;

import java.util.LinkedList;

public class ListaResproduccion {
    public static void main(String[] args) {
        LinkedList<String> listaReproduccion = new LinkedList<>();

        listaReproduccion.addLast("Song 1 - Artista A");
        listaReproduccion.addLast("Song 2 - Artista B");
        listaReproduccion.addLast("Song 3 - Artista C");
        listaReproduccion.addLast("Song 4 - Artista D");

        System.out.println("Lista de reproducción actual: ");
        mostrarLista(listaReproduccion);

        listaReproduccion.remove("Song 2 - Artista B");

        System.out.println("\n Después de eliminar la canción: ");
        mostrarLista(listaReproduccion);

        listaReproduccion.addLast("Song 5 - Artista E");
        listaReproduccion.addLast("Song 6 - Artista F");

        System.out.println("\nLista de reproducción actualizada: ");
        mostrarLista(listaReproduccion);
    }
    public static void mostrarLista(LinkedList<String> lista) {
        for(String cancion : lista){
            System.out.println(cancion);
        }
    }
}
